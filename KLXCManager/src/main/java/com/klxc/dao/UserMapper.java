package com.klxc.dao;

import com.klxc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User getUser(@Param("userName") String userName, @Param("password") String password);

    User getUserById(Integer id);

    List<User> getAllUserList();

    List<User> getUserInfo(String nickName);

    void addUser(User user) throws Exception;

    boolean uptUser(User user) throws Exception;

    boolean uptPwd(Integer id, String password) throws Exception;
}
