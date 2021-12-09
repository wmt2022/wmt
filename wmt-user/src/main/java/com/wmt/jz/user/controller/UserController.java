package com.wmt.jz.user.controller;

import com.wmt.common.bean.ResultBean;
import com.wmt.jz.user.model.User;
import com.wmt.jz.user.sevice.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/user")
@Slf4j
@Api(tags = "用户相关接口")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    @ApiOperation("获取用户列表")
    public ResultBean<Integer> addUser(@RequestBody User user) {
        return ResultBean.ok(userService.addUser(user));
    }

    @GetMapping("/getUserList")
    @ApiOperation("获取用户列表")
    public ResultBean<List<User>> getUserList() {
        List<User> userList=userService.getUserList();
        return ResultBean.ok(userList);
    }
}
