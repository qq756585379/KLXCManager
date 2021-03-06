package com.klxc.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private String username;//登录用户名

    private Integer userType;

    private String nickname;

    private String password;

    private String email;

    private String phone;

    private String question;

    private String answer;

    private Integer role;// 1:普通用户；1:区域负责人；2：后台管理人员

    private String userRoleStr;

    private String createTime;

    private String updateTime;

    private String tabInfo;
}
