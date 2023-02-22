package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.common.R;
import com.hch.common.enums.MyEnum;
import com.hch.mapper.ScrapApplyMapper;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.dto.ApproveDTO;
import com.hch.model.entity.ScrapApply;
import com.hch.model.entity.Use;
import com.hch.model.entity.User;
import com.hch.service.ScrapApplyService;
import com.hch.service.SystemService;
import com.hch.service.UseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScrapApplyServiceImpl extends ServiceImpl<ScrapApplyMapper, ScrapApply> implements ScrapApplyService {
    @Autowired
    private ScrapApplyService scrapApplyService;

    @Autowired
    private UseService useService;

    @Autowired
    private SystemService systemService;

    /**
     * 报废申请
     *
     * @param applyDTO 报废参数
     * @return 返回结果
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public R<?> scrapApply(ApplyDTO applyDTO) {
        if (applyDTO != null) {
            //查询资产是否为使用中
            Use use = useService.lambdaQuery()
                    .eq(Use::getAssetId, applyDTO.getAssetId())
                    .eq(Use::getState, MyEnum.APPLY_STATUS_ING.getCode())
                    .ge(Use::getNumber, applyDTO.getNumber())
                    .one();
            if (use != null) {
                ScrapApply scrapApply = new ScrapApply();
                BeanUtils.copyProperties(applyDTO, scrapApply);
                //设置申请时间
                scrapApply.setApplyTime(systemService.nowTime());
                //写入scrap表
                scrapApplyService.save(scrapApply);
                return R.Success();
            }
        }
        return R.Failed();
    }

    /**
     * 报废审核
     *
     * @param approveDTO 报废参数
     * @return 返回结果
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public R<?> scrapApprove(ApproveDTO approveDTO) {
        if (approveDTO != null) {
            //验证审核权限
            User user = systemService.getApproveUser(approveDTO.getUserId());
            //验证资产状态
            ScrapApply scrapApply = scrapApplyService.lambdaQuery()
                    .eq(ScrapApply::getAssetId, approveDTO.getAssetId())
                    .eq(ScrapApply::getStatus, MyEnum.APPLY_STATUS_ING.getCode()) //已申请状态
                    .one();
            if ((user != null) && (scrapApply != null)) {
                //设置审核时间
                scrapApply.setApproveTime(systemService.nowTime());
                if (approveDTO.getIsApprove() == MyEnum.APPROVE_PASS_YES.getCode()) {
                    //审核通过，申请状态改为已通过
                    scrapApply.setStatus(MyEnum.APPLY_STATUS_PASS.getCode());
                    scrapApplyService.updateById(scrapApply);
                    return R.Success();
                }
                if (approveDTO.getIsApprove() == MyEnum.APPROVE_PASS_NO.getCode()) {
                    //审核不通过，申请状态改为未通过审核
                    scrapApply.setStatus(MyEnum.APPLY_STATUS_NOTPASS.getCode());
                    scrapApplyService.updateById(scrapApply);
                    return R.Success();
                }
            }
        }
        return R.Failed();
    }
}
