package com.hch.controller;

import com.hch.common.R;
import com.hch.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/asset")
public class SystemController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户登录")
    @PostMapping("/userLogin/{userId}/{password}")
    public R<?> userLogin(@PathVariable String userId, @PathVariable String password){
        return userService.userLogin(userId, password);
    }
}
