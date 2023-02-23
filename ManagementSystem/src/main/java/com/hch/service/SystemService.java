package com.hch.service;

import com.hch.model.entity.User;

import java.text.ParseException;
import java.util.Date;

public interface SystemService {
    /**
     * 获取当前时间
     * @return 当前时间
     */
    Date nowTime() throws ParseException;

    /**
     * 验证申请权限
     * @param userId 用户ID
     * @return 用户信息
     */
    User getApplyUser(String userId);

    /**
     * 验证审核权限
     * @param userId 用户ID
     * @return 用户信息
     */
    User getApproveUser(String userId);
}
