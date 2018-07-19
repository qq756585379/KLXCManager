package com.klxc.dao;

import com.klxc.pojo.User;

import java.util.List;

public interface UserMapper {

    User getUser(String userName, String password);

    User getUserById(Integer id);

    List<User> getAllUserList();

    List<User> getUserInfo(String nickName);

    void addUser(User user) throws Exception;

    boolean uptUser(User user) throws Exception;

    boolean uptPwd(Integer id, String password) throws Exception;
}
