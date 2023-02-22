package com.hch.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hch.common.R;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.dto.ApproveDTO;
import com.hch.model.entity.UseApply;

public interface UseApplyService extends IService<UseApply> {
    /**
     * 使用申请
     * @param applyDTO 使用参数
     * @return 返回结果
     */
    R<?> useApply(ApplyDTO applyDTO);

    /**
     * 使用审核
     * @param approveDTO 使用参数
     * @return 返回结果
     */
    R<?> useApprove(ApproveDTO approveDTO);
}
