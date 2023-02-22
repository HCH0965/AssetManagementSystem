package com.hch.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data

@ApiModel(value = "purchase_apply")
@TableName(value = "purchase_apply")
public class PurchaseApply implements Serializable {
    /**
     * 自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="自增ID")
    private Integer id;

    /**
     * 资产编号
     */
    @TableId(value = "asset_id")
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
    private String applyTime;

    /**
     * 申请状态（0: 已申请 1:已通过 3:已购买）
     */
    @TableField(value = "status")
    @ApiModelProperty(value = "申请状态")
    private Integer status;

    /**
     * 审核人
     */
    @TableField(value = "approver")
    @ApiModelProperty(value = "审核人")
    private String approver;

    /**
     * 审核时间
     */
    @TableField(value = "approve_time",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "审核时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private String approveTime;

    /**
     * 执行人
     */
    @TableField(value = "executor")
    @ApiModelProperty(value = "执行人")
    private String executor;

    /**
     * 执行时间
     */
    @TableField(value = "execute_time",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "执行时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private String executeTime;

    /**
     * 时间戳
     */
    @TableField(value = "purchase_time",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "时间戳")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private String timestamp;
}