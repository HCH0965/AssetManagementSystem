package com.hch.model.vo;

import lombok.Data;

@Data
public class AssetListVO {
    private String assetId;
    private String assetName;
    private Integer state;
    private Integer number;
    private String department;
}
