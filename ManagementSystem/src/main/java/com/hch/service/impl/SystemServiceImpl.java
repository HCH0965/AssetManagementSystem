package com.hch.service.impl;

import com.hch.common.enums.MyEnum;
import com.hch.model.entity.User;
import com.hch.service.SystemService;
import com.hch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Service
public class SystemServiceImpl implements SystemService {
    @Autowired
    private UserService userService;

    /**
     * 获取当前时间
     * @return 当前时间
     */
    @Override
    public Date nowTime() throws ParseException {
        Date dateTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = formatter.format(dateTime);
        return formatter.parse(str);
    }

    /**
     * 验证申请权限
     * @param userId 用户ID
     * @return 用户信息
     */
    @Override
    public User getApplyUser(String userId) {
        User user = userService.lambdaQuery()
                .eq(User::getUserId, userId)
                .between(User::getAuthority, MyEnum.USER_AUTHORITY_APPROVE.getCode(), MyEnum.USER_AUTHORITY_APPLY.getCode()) //权限为可审核、用户
                .between(User::getRole, MyEnum.USER_ROLE_MANAGER.getCode(), MyEnum.USER_ROLE_USER.getCode()) //角色为管理员、用户
                .one();
        return user;
    }

    /**
     * 验证审核权限
     * @param userId 用户ID
     * @return 用户信息
     */
    @Override
    public User getApproveUser(String userId) {
        User user = userService.lambdaQuery()
                .eq(User::getUserId, userId)
                .eq(User::getAuthority, MyEnum.USER_AUTHORITY_APPROVE.getCode()) //权限为可审核
                .eq(User::getRole, MyEnum.USER_ROLE_MANAGER.getCode()) //角色为管理员
                .one();
        return user;
    }
}
