package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.common.R;
import com.hch.mapper.ScrapMapper;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.entity.Asset;
import com.hch.model.entity.Scrap;
import com.hch.service.AssetService;
import com.hch.service.ScrapService;
import com.hch.service.SystemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScrapServiceImpl extends ServiceImpl<ScrapMapper, Scrap> implements ScrapService {
    @Autowired
    private ScrapService scrapService;

    @Autowired
    private AssetService assetService;

    @Autowired
    private SystemService systemService;

    /**
     * 资产报废申请
     * @param applyDTO 报废参数
     * @return 返回结果
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public R<?> scrap(ApplyDTO applyDTO) {
        if (applyDTO != null) {
            Asset asset = assetService.lambdaQuery()
                    .eq(Asset::getAssetId, applyDTO.getAssetId())
                    .one();
            //查询资产是否存在
            if (asset != null) {
                Scrap scrap = new Scrap();
                BeanUtils.copyProperties(applyDTO, scrap);
                //设置申请时间
                scrap.setScrapTime(systemService.nowTime());
                //写入scrap表
                scrapService.save(scrap);
                return R.Success();
            }
        }
        return R.Failed();
    }
}
