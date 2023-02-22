package com.hch.model.dto;

import lombok.Data;

@Data
public class ApproveDTO {
    private String assetId;

    private String userId;

    /**
     * 审核是否通过 0:通过 1:不通过
     */
    private Integer isApprove;
}
