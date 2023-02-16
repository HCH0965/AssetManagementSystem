package com.hch.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hch.common.R;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.dto.ApproveDTO;
import com.hch.model.entity.PurchaseApply;

public interface PurchaseApplyService extends IService<PurchaseApply> {
    /**
     * 购买申请
     * @param applyDTO 资产信息
     * @return 返回结果
     */
    R<?> purchaseApply(ApplyDTO applyDTO);

    /**
     * 购买审核
     * @param approveDTO 审核信息
     * @return 返回结果
     */
    R<?> purchaseApprove(ApproveDTO approveDTO);
}
