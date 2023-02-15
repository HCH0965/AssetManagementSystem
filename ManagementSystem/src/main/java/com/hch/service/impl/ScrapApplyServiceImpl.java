package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.common.R;
import com.hch.common.enums.MyEnum;
import com.hch.mapper.ScrapApplyMapper;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.entity.ScrapApply;
import com.hch.model.entity.Use;
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
     * 资产报废申请
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
                    .eq(Use::getState, MyEnum.ASSET_STATE_USE.getCode())
                    .ge(Use::getNumber, applyDTO.getNumber())
                    .one();
            if (use != null) {
                ScrapApply scrapApply = new ScrapApply();
                BeanUtils.copyProperties(applyDTO, scrapApply);
                //设置申请时间
                scrapApply.setScrapTime(systemService.nowTime());
                //写入scrap表
                scrapApplyService.save(scrapApply);
                return R.Success();
            }
        }
        return R.Failed();
    }
}
