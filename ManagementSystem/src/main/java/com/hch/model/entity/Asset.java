package com.hch.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String assetId;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String assetName;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private Integer state;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String price;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private Integer number;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String totalprice;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String department;

}