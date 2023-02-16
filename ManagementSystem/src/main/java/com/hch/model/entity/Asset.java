package com.hch.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "asset")
@TableName(value = "asset")
public class Asset implements Serializable {
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
     * 资产状态（0:未使用 1:在使用 2:已报废）
     */
    @TableField(value = "state")
    @ApiModelProperty(value = "资产状态")
    private Integer state;

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
     * 所属部门
     */
    @TableField(value = "department")
    @ApiModelProperty(value = "所属部门")
    private String department;

    /**
     * 时间戳
     */
    @TableField(value = "purchase_time",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "时间戳")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private String timestamp;
}