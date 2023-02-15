package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.common.R;
import com.hch.common.enums.MyEnum;
import com.hch.mapper.UseApplyMapper;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.entity.Asset;
import com.hch.model.entity.UseApply;
import com.hch.service.AssetService;
import com.hch.service.SystemService;
import com.hch.service.UseApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
     * @param applyDTO 使用参数
     * @return 返回结果
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public R<?> useApply(ApplyDTO applyDTO) {
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
}
