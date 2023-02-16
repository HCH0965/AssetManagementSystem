package com.hch.model.dto;

import lombok.Data;

@Data
public class ApplyDTO {
    private String assetId;

    private String assetName;

    private String price;

    private Integer number;

    private String totalprice;

    private String applicant;

    private Integer state;

    private String department;

    private String userId;
}
