package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.common.enums.MyEnum;
import com.hch.mapper.AssetMapper;
import com.hch.model.entity.Asset;
import com.hch.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetServiceImpl extends ServiceImpl<AssetMapper, Asset> implements AssetService {

    @Autowired
    private AssetService assetService;

    /**
     * 查询资产清单
     * @return 资产清单
     */
    @Override
    public List<Asset> showAllAsset() {
        List<Asset> allAsset = assetService.list();
        return allAsset;
    }

    /**
     * 查询未使用资产
     * @return 资产清单
     */
    @Override
    public List<Asset> showVacantAsset() {
        List<Asset> vacantAsset = assetService.lambdaQuery()
                .eq(Asset::getState, MyEnum.ASSET_STATE_VACANT.getCode())
                .list();
        return vacantAsset;
    }

    /**
     * 查询使用中资产
     * @return 资产清单
     */
    @Override
    public List<Asset> showUseAsset() {
        List<Asset> useAsset = assetService.lambdaQuery()
                .eq(Asset::getState, MyEnum.ASSET_STATE_USE.getCode())
                .list();
        return useAsset;
    }

    /**
     * 查询报废资产
     * @return 资产清单
     */
    @Override
    public List<Asset> showScrapAsset() {
        List<Asset> vacantAsset = assetService.lambdaQuery()
                .eq(Asset::getState, MyEnum.ASSET_STATE_SCRAP.getCode())
                .list();
        return vacantAsset;
    }

    /**
     * 查询报未废资产
     * @return 资产清单
     */
    @Override
    public List<Asset> showNotScrapAsset() {
        List<Asset> notScrapAsset = assetService.lambdaQuery()
                .ne(Asset::getState, MyEnum.ASSET_STATE_SCRAP.getCode())
                .ne(Asset::getNumber, MyEnum.ASSE_NUMBER_NONE.getCode()) //数量不为0
                .list();
        return notScrapAsset;
    }
}
