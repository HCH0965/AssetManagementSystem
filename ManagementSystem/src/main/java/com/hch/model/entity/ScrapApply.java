package com.hch.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "scrap_apply")
@TableName(value = "scrap_apply")
public class ScrapApply implements Serializable {
    /**
     * 自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="自增ID")
    private Integer id;

    /**
     * 资产编号
     */
    @TableField(value = "asset_id")
    @ApiModelProperty(value = "资产编号")
    private String assetId;

    /**
     * 资产名称
     */
    @TableField(value = "asset_name")
    @ApiModelProperty(value = "资产名称")
    private String assetName;

    /**
     * 资产数量
     */
    @TableField(value = "number")
    @ApiModelProperty(value = "资产数量")
    private Integer number;

    /**
     * 申请人
     */
    @TableField(value = "applicant")
    @ApiModelProperty(value = "申请人")
    private String applicant;

    /**
     * 申请时间
     */
    @TableField(value = "apply_time",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "申请时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private String applyTime;

    /**
     * 资产状态（0:已申请 1:已通过）
     */
    @TableField(value = "state")
    @ApiModelProperty(value = "资产状态")
    private Integer state;

    /**
     * 报废戳
     */
    @TableField(value = "scrap_time",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "时间戳")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private String scrapTime;
}