package com.wmt.jz.work.controller;

import com.wmt.common.bean.ResultBean;
import com.wmt.jz.work.model.WorkType;
import com.wmt.jz.work.service.WorkService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/work")
public class WorkController {
    @Autowired
    private WorkService workService;

    @GetMapping("/addWorkType")
    @ApiOperation("获取用户列表")
    public ResultBean<Integer> addWorkType(@RequestBody WorkType workType) {
        Integer result=workService.addWorkType(workType);
        return ResultBean.ok(result);
    }
}
