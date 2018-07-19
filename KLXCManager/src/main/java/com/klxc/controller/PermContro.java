package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.klxc.pojo.Permission;
import com.klxc.service.PermService;
import com.klxc.tool.RequestTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/perm")
public class PermContro {

    @Autowired
    private PermService permService;

    @RequestMapping("/getPermList")
    public String getPermList(HttpServletRequest request) {
        List<Permission> list = permService.getPermList();
        request.setAttribute("list", list);
        return "/permission";
    }

    @RequestMapping("/uptPerm")
    public String uptPerm(HttpServletRequest request) {
        return "/permissionbind";
    }

    @RequestMapping("/addPerm")
    public String addPerm(HttpServletRequest request) {
        Permission perm = new Permission();
        perm.setName(RequestTool.getString(request, "name"));
        perm.setRemark(RequestTool.getString(request, "remark"));
        permService.addPerm(perm);
        return "redirect:/perm/getPermList";
    }

    @RequestMapping("/delPerm")
    public String delPerm(HttpServletRequest request) {
        int tid = RequestTool.getInt(request, "tid");
        permService.delPerm(tid);
        return "redirect:/perm/getPermList";
    }
}
