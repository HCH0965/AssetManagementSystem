package com.hch.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "user")
@TableName(value = "user")
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
}