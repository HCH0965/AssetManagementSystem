package com.hch.service;

import com.hch.model.entity.User;

import java.util.Date;

public interface SystemService {
    /**
     * 获取当前时间
     * @return 当前时间
     */
    String nowTime();

    /**
     * 查询申请权限
     * @param userId 用户ID
     * @return 用户信息
     */
    User getApplyUser(String userId);

    /**
     * 查询审核权限
     * @param userId 用户ID
     * @return 用户信息
     */
    User getApproveUser(String userId);
}
