package com.hch.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "")
@TableName(value = "")
public class User implements Serializable {
    /**
     * 自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "自增ID")
    private Integer id;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String userId;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String username;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String password;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private Integer role;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private Integer authority;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String department;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String position;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String eMail;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private String telephone;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private Integer age;

    /**
     *
     */
    @TableField(value = "",fill = FieldFill.INSERT)
    @ApiModelProperty(value = "")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date enterTime;

    /**
     *
     */
    @TableField(value = "")
    @ApiModelProperty(value = "")
    private Integer workYears;

}