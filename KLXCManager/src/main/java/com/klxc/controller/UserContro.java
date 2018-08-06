package com.klxc.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.klxc.common.Const;
import com.klxc.pojo.User;
import com.klxc.service.TabService;
import com.klxc.service.UserService;
import com.klxc.tool.Log;
import com.klxc.tool.RequestTool;
import com.klxc.util.TimeTool;
import com.klxc.vo.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class UserContro {

    @Autowired
    private UserService userService;
    @Autowired
    private TabService tabService;
//
//    @Autowired
//    private PermService permService;

//    @RequestMapping("/toAddUser")
//    public String toAddUser(HttpServletRequest request) {
//        List<Permission> list = permService.getPermList();
//        request.setAttribute("list", list);
//        return "user/useradd";
//    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        try {
            String userName = RequestTool.getString(request, "userName");
            String password = RequestTool.getString(request, "password");
            User user = userService.login(userName, password);
            if (user == null) {
                return "login";
            }

            HttpSession session = request.getSession();
            user.setPassword("");
            session.setAttribute(Const.UserInfo, user);

            UserData userData = new UserData();
            userData.setLoginTime(TimeTool.formatDateTime(new Date()));
            userData.setHasProve(user.getTabInfo());
            session.setAttribute(Const.UserData, userData);
            session.setAttribute(Const.Tab, tabService.getTabList(user.getTabInfo()));
        } catch (Exception e) {
            e.printStackTrace();
            return "login";
        }

        return "index";
    }

//    @RequestMapping("/getUserList")
//    public String getUserList(HttpServletRequest request) {
//        List<User> list = userService.getUserList();
//        request.setAttribute("list", list);
//        return "user/userlist";
//    }
//
//    @RequestMapping("/addUser")
//    public String addUser(HttpServletRequest request) {
//        User user = new User();
//        RequestTool.populate(request, user);
//
//        user.setCreateTime(TimeTool.formatDateTime(new Date()));
//        boolean succ = userService.addUser(user);
//        if (!succ) {
//            return "user/useradd";
//        }
//        return "redirect:/user/getUserList";
//    }
//
//    @RequestMapping("/getUserById")
//    public String getUserById(HttpServletRequest request) {
//        int userId = RequestTool.getInt(request, "userId");
//        User user = userService.getUserById(userId);
//        request.setAttribute("user", user);
//        return "user/useredit";
//    }
//
//    @RequestMapping("/toUserEidt")
//    public String toUserEidt(HttpServletRequest request) {
//        User user = UserData.getUser(request);
//        request.setAttribute("user", user);
//        return "user/useredit";
//    }
//
//    @RequestMapping("/toUserEidtPwd")
//    public String toUserEidtPwd(HttpServletRequest request) {
//        User user = UserData.getUser(request);
//        request.setAttribute("userId", user.getUserId());
//        return "user/usereditpwd";
//    }
//
//    @RequestMapping("/uptUser")
//    public String uptUser(HttpServletRequest request) {
//        User user = new User();
//        RequestTool.populate(request, user);
//
//        boolean succ = userService.uptUser(user);
//        if (!succ) {
//            return "user/useredit";
//        }
//        int role = UserData.getUser(request).getUserRole();
//        if (Const.Role_Manager == role) {
//            return "redirect:/user/getUserList";
//        } else {
//            request.setAttribute("user", user);
//            request.setAttribute("msg", "修改成功");
//            return "user/useredit";
//        }
//    }
//
//    @RequestMapping("/uptPwd")
//    public String uptPwd(HttpServletRequest request) {
//        int userId = RequestTool.getInt(request, "userId");
//        User user = userService.getUserById(userId);
//        String old_pwd = RequestTool.getString(request, "old_pwd");
//        String new_pwd = RequestTool.getString(request, "new_pwd");
//        old_pwd = UtilTool.toString(Md5.encoderMd5(old_pwd));
//        if (!old_pwd.equals(user.getUserPassword())) {
//            request.setAttribute("msg", "老密码错误");
//            return "user/usereditpwd";
//        }
//        boolean succ = userService.uptPwd(new_pwd, userId);
//        if (succ) {
//            request.setAttribute("msg", "修改成功");
//        }
//        request.setAttribute("userId", userId);
//        return "user/usereditpwd";
//    }
}
