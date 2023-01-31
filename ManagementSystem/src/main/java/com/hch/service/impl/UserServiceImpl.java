package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.mapper.UserMapper;
import com.hch.model.entity.User;
import com.hch.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}
