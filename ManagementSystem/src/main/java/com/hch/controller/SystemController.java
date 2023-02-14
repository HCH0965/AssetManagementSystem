package com.hch.controller;

import com.hch.common.R;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.dto.UserLoginDTO;
import com.hch.model.entity.Asset;
import com.hch.service.AssetService;
import com.hch.service.PurchaseService;
import com.hch.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/asset")
public class SystemController {

    @Autowired
    private UserService userService;

    @Autowired
    private AssetService assetService;

    @Autowired
    private PurchaseService purchaseService;

    @ApiOperation(value = "登录界面")
    @RequestMapping("/loginPage")
    public String loginPage(Model model) {
        model.addAttribute("userLoginDTO", new UserLoginDTO());
        return "login/UserLogin";
    }

    @ApiOperation(value = "用户登录")
    @PostMapping("/userLogin")
    public String userLogin(@ModelAttribute UserLoginDTO userLoginDTO) {
        R flag = userService.userLogin(userLoginDTO);
        //判断是否登录成功
        if (flag.succeeded()) {
            return homePage(null);
        }
        return "Wrong";
    }

    @ApiOperation(value = "首页")
    @PostMapping("/homePage")
    public String homePage(Model model) {
        List<Asset> assetList = assetService.showNOScrapAsset();
        //向页面传值
        model.addAttribute("assetList", assetList);
        return "homePage/HomePage";
    }

    @ApiOperation(value = "购买申请")
    @PostMapping("/purchase")
    public String purchase(ApplyDTO applyDTO) {
        R flag = purchaseService.purchase(applyDTO);
        if (flag.succeeded()) {
            return homePage(null);
        }
        return "Wrong";
    }
}