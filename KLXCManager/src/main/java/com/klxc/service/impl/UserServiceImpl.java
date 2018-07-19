package com.klxc.service.impl;

import com.klxc.dao.UserMapper;
import com.klxc.pojo.User;
import com.klxc.service.UserService;
import com.klxc.tool.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(String userName, String password) {
        password = Md5.encoderMd5(password);
        return userMapper.getUser(userName, password);
    }

    public boolean addUser(User user) {
        if (user == null) {
            return false;
        }
        user.setPassword(Md5.encoderMd5(user.getPassword()));
        try {
            userMapper.addUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public User getUserById(Integer userId) {
        return userMapper.getUserById(userId);
    }

    public List<User> getUserList() {
        return userMapper.getAllUserList();
    }

    public List<User> getUserInfo(String nickName) {
        return userMapper.getUserInfo(nickName);
    }

    public boolean uptUser(User user) {
        if (user == null) {
            return false;
        }
        user.setPassword(Md5.encoderMd5(user.getPassword()));
        try {
            userMapper.uptUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean uptPwd(String password, Integer id) {
        try {
            password = Md5.encoderMd5(password);
            userMapper.uptPwd(id, password);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

