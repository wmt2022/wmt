package com.wmt.jz.user.sevice;

import com.wmt.jz.user.model.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    Integer addUser(User user);

    User getUserByAccount(Integer userId);
}
