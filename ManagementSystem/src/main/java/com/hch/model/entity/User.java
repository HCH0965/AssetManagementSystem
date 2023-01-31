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
     * 用户编号
     */
    @TableField(value = "user_id")
    @ApiModelProperty(value = "用户编号")
    private String userId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 用户密码
     */
    @TableField(value = "password")
    @ApiModelProperty(value = "用户密码")
    private String password;

    /**
     * 角色（0:管理员 1:用户）
     */
    @TableField(value = "role")
    @ApiModelProperty(value = "角色")
    private Integer role;

    /**
     * 权限（0:可申请 1:可审核）
     */
    @TableField(value = "authority")
    @ApiModelProperty(value = "权限")
    private Integer authority;

    /**
     * 所属部门
     */
    @TableField(value = "department")
    @ApiModelProperty(value = "所属部门")
    private String department;

    /**
     * 职位
     */
    @TableField(value = "position")
    @ApiModelProperty(value = "职位")
    private String position;
}