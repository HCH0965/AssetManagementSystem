package com.hch.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hch.common.R;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.entity.Purchase;

public interface PurchaseService extends IService<Purchase> {
    /**
     * 购买申请
     * @param applyDTO 资产信息
     * @return 返回结果
     */
    R<?> purchase(ApplyDTO applyDTO);
}
