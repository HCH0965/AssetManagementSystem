package com.hch.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hch.common.R;
import com.hch.model.dto.PurchaseDTO;
import com.hch.model.entity.Purchase;

public interface PurchaseService extends IService<Purchase> {
    /**
     * 购买申请
     * @param purchaseDTO 资产信息
     * @return 返回结果
     */
    R<?> purchase(PurchaseDTO purchaseDTO);
}
