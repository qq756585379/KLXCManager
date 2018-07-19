package com.klxc.service;

import com.klxc.pojo.User;

import java.util.List;

public interface UserService {
    User login(String userName, String password);

    User getUserById(Integer userId);

    List<User> getUserList();

    boolean addUser(User user);

    boolean uptUser(User user);

    boolean uptPwd(String password, Integer id);

    List<User> getUserInfo(String nickName);
}
