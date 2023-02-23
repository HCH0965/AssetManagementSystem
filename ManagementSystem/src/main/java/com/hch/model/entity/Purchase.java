package com.hch.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "purchase")
@TableName(value = "purchase")
public class Purchase implements Serializable {
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
     * 厂商
     */
    @TableField(value = "manufacturer")
    @ApiModelProperty(value = "厂商")
    private String manufacturer;

    /**
     * 资产价格
     */
    @TableField(value = "price")
    @ApiModelProperty(value = "资产价格")
    private String price;

    /**
     * 资产数量
     */
    @TableField(value = "number")
    @ApiModelProperty(value = "资产数量")
    private Integer number;

    /**
     * 总价
     */
    @TableField(value = "totalprice")
    @ApiModelProperty(value = "总价")
    private String totalprice;

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
    private Date applyTime;

    /**
     * 资产状态（0: 已申请 1:已通过）
     */
    @TableField(value = "state")
    @ApiModelProperty(value = "资产状态")
    private Integer state;

    /**
     * 所属部门
     */
    @TableField(value = "department")
    @ApiModelProperty(value = "所属部门")
    private String department;

    /**
     * 同意人
     */
    @TableField(value = "consenter")
    @ApiModelProperty(value = "同意人")
    private String consenter;

    /**
     * 同意时间
     */
    @TableField(value = "agreed_time",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "同意时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date agreedTime;

    /**
     * 购买时间
     */
    @TableField(value = "purchase_time",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "购买时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date purchaseTime;

    /**
     * 时间戳
     */
    @TableField(value = "purchase_time",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "时间戳")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date timestamp;
}