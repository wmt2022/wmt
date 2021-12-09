package com.wmt.jz.work.service.impl;

import com.wmt.common.bean.ResultBean;
import com.wmt.jz.work.feign.UserClient;
import com.wmt.jz.work.mapper.WorkMapper;
import com.wmt.jz.work.model.WorkType;
import com.wmt.jz.work.service.WorkService;
import com.wmt.jz.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    private WorkMapper workMapper;
    @Resource
    private UserClient userClient;
    @Override
    public Integer addWorkType(WorkType workType) {
        int insert = 0;
        Integer userId = workType.getUserId();
        ResultBean<User> resultBean = userClient.getUserByUserId(userId);
        if (resultBean.getCode() == 200) {
            User user = resultBean.getData();
            workType.setUserAccount(user.getUserAccount());
             insert = workMapper.insert(workType);
        }
        return insert;
    }
}
