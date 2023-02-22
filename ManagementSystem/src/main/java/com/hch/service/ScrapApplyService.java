package com.hch.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hch.common.R;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.dto.ApproveDTO;
import com.hch.model.entity.ScrapApply;

public interface ScrapApplyService extends IService<ScrapApply> {
    /**
     * 报废申请
     * @param applyDTO 报废参数
     * @return 返回结果
     */
    R<?> scrapApply(ApplyDTO applyDTO);

    /**
     * 报废审核
     * @param approveDTO 报废参数
     * @return 返回结果
     */
    R<?> scrapApprove(ApproveDTO approveDTO);
}
