package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.common.R;
import com.hch.common.enums.MyEnum;
import com.hch.mapper.UseApplyMapper;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.dto.ApproveDTO;
import com.hch.model.entity.Asset;
import com.hch.model.entity.UseApply;
import com.hch.model.entity.User;
import com.hch.service.AssetService;
import com.hch.service.SystemService;
import com.hch.service.UseApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;

@Service
public class UseApplyServiceImpl extends ServiceImpl<UseApplyMapper, UseApply> implements UseApplyService {
    @Autowired
    private AssetService assetService;

    @Autowired
    private UseApplyService useApplyService;

    @Autowired
    private SystemService systemService;

    /**
     * 使用申请
     *
     * @param applyDTO 使用参数
     * @return 返回结果
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public R<?> useApply(ApplyDTO applyDTO) throws ParseException {
        if (applyDTO != null) {
            //验证资产是否存在且未使用
            Asset asset = assetService.lambdaQuery()
                    .eq(Asset::getAssetId, applyDTO.getAssetId())
                    .eq(Asset::getState, MyEnum.ASSET_STATE_VACANT.getCode())
                    .ge(Asset::getNumber, applyDTO.getNumber())
                    .one();
            if (asset != null) {
                UseApply useApply = new UseApply();
                BeanUtils.copyProperties(applyDTO, useApply);
                //获取当前时间
                useApply.setApplyTime(systemService.nowTime());
                //写入use表
                useApplyService.save(useApply);
                return R.Success();
            }
        }
        return R.Failed();
    }

    /**
     * 使用审核
     *
     * @param approveDTO 使用参数
     * @return 返回结果
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public R<?> useApprove(ApproveDTO approveDTO) throws ParseException {
        if (approveDTO != null) {
            //验证审核权限
            User user = systemService.getApproveUser(approveDTO.getUserId());
            //验证资产状态
            UseApply useApply = useApplyService.lambdaQuery()
                    .eq(UseApply::getAssetId, approveDTO.getAssetId())
                    .eq(UseApply::getStatus, MyEnum.APPLY_STATUS_ING)  //已申请状态
                    .one();
            if ((user != null) && (useApply != null)) {
                //设置审核时间
                useApply.setApplyTime(systemService.nowTime());
                if (approveDTO.getIsApprove() == MyEnum.APPROVE_PASS_YES.getCode()) {
                    //审核通过，申请状态改为已通过
                    useApply.setStatus(MyEnum.APPLY_STATUS_PASS.getCode());
                    useApplyService.updateById(useApply);
                    return R.Success();
                }
                if (approveDTO.getIsApprove() == MyEnum.APPROVE_PASS_NO.getCode()) {
                    //审核不通过，申请状态改为未通过审核
                    useApply.setStatus(MyEnum.APPLY_STATUS_NOTPASS.getCode());
                    useApplyService.updateById(useApply);
                    return R.Success();
                }
            }
        }
        return R.Failed();
    }
}
