package com.hch.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hch.common.R;
import com.hch.model.dto.UserLoginDTO;
import com.hch.model.entity.User;

public interface UserService extends IService<User> {
    /**
     * 用户登录
     * @param userLoginDTO 登录参数
     * @return 返回结果
     */
    R<?> userLogin(UserLoginDTO userLoginDTO);
}
