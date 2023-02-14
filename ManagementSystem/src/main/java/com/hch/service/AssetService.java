package com.hch.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hch.model.entity.Asset;

import java.util.List;

public interface AssetService extends IService<Asset> {
    /**
     * 查询资产清单
     * @return 资产清单
     */
    List<Asset> showAllAsset();

    /**
     * 查询未使用资产
     * @return 资产清单
     */
    List<Asset> showVacantAsset();

    /**
     * 查询使用中资产
     * @return 资产清单
     */
    List<Asset> showUseAsset();

    /**
     * 查询报废资产
     * @return 资产清单
     */
    List<Asset> showScrapAsset();

    /**
     * 查询报未废资产
     * @return 资产清单
     */
    List<Asset> showNotScrapAsset();
}
