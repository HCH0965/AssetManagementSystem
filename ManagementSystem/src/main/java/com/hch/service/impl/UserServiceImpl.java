package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.common.R;
import com.hch.mapper.UserMapper;
import com.hch.model.dto.UserLoginDTO;
import com.hch.model.entity.User;
import com.hch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param userLoginDTO 登录参数
     * @return 返回结果
     */
    @Override
    public R<?> userLogin(UserLoginDTO userLoginDTO) {
        List<User> userList = userService.lambdaQuery()
                .eq(User::getUserId, userLoginDTO.getUserId())
                .eq(User::getPassword, userLoginDTO.getPassword())
                .list();
        if (userList.size() != 1){
            return R.Failed();
        }
        return R.Success();
    }
}
