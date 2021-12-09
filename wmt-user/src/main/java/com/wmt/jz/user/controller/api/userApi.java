package com.wmt.jz.user.controller.api;

import com.wmt.common.bean.ResultBean;
import com.wmt.jz.user.model.User;
import com.wmt.jz.user.sevice.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/user")
public class userApi {

    @Autowired
    UserService userService;

    @GetMapping("/getUserByAccount")
    @ApiOperation("通过iud获取用户信息")
    public ResultBean<User> getUserByAccount(@RequestParam Integer userId) {
        User user=userService.getUserByAccount(userId);
        return ResultBean.ok(user);
    }
}
