package com.wmt.jz.user.sevice.impl;

import com.wmt.jz.user.mapper.UserMapper;
import com.wmt.jz.user.model.User;
import com.wmt.jz.user.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Integer addUser(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }

    @Override
    public User getUserByAccount(Integer userId) {
        return  userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> getUserList() {
        List<User> users = userMapper.selectAll();
        return users;
    }


}
