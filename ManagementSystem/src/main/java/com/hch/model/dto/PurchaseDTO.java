package com.hch.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PurchaseDTO {
    private String assetId;
    private String assetName;
    private String price;
    private Integer number;
    private String applicant;
    private Date applyTime;
    private Integer state;
    private String department;
}
