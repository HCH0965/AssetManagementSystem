package com.hch.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "use")
@TableName(value = "use")
public class Use implements Serializable {
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
    private Integer number;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String applicant;

    /**
     *
     */
    @TableField(value = "",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date applyTime;

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
    private String consenter;

    /**
     *
     */
    @TableField(value = "",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date agreedTime;

    /**
     *
     */
    @TableField(value = "",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date useTime;

}