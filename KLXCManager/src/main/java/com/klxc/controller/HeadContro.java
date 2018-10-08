package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.klxc.common.Const;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/head")
public class HeadContro {

    @RequestMapping("/login")
    public String toLogin() {
        return "/login";
    }

    @RequestMapping("/index")
    public String toIndex() {
        return "/index";
    }

    @RequestMapping("/operate")
    public String toCompany() {
        return "/operate";
    }

    @RequestMapping("/market")
    public String toProduct() {
        return "/market";
    }

    @RequestMapping("/city")
    public String toCity() {
        return "/city";
    }

    @RequestMapping("/place")
    public String toPlace() {
        return "/place/place";
    }

    @RequestMapping("/weixin")
    public String toWeiXin() {
        return "/weixin/weixin";
    }

    @RequestMapping("/permission")
    public String toComment() {
        return "/permission";
    }

    @RequestMapping("/user")
    public String toUser() {
        return "/user/user";
    }

    @RequestMapping("/about")
    public String toAbout() {
        return "/place";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute(Const.UserInfo);
        return "/login";
    }
}
