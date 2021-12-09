package com.wmt.jz.user.api;

import com.wmt.common.bean.ResultBean;
import com.wmt.jz.user.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public interface userApi {
    @GetMapping("/api/user/getUserByUserId")
    @ApiOperation("通过工号获取用户信息")
    public ResultBean<User> getUserByUserId(@RequestParam Integer account);
}
