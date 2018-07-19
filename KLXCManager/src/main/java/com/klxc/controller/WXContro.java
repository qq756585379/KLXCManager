package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.klxc.common.Const;
import com.klxc.pojo.WxJoinInfo;
import com.klxc.pojo.WxSignInfo;
import com.klxc.service.WXService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.page.PageTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/weixin")
public class WXContro {

    private int pageSize = Const.pageSize20;

    @Autowired
    private WXService wXService;

    @RequestMapping("/getWxSignList")
    public String getSignUpList(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");

        int totalSize = wXService.getWxSignCount();
        List<WxSignInfo> list = wXService.getWxSignList(curPage, pageSize);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "weixin/getWxSignList");
        return "weixin/signuplist";
    }

    @RequestMapping("/getWxJoinList")
    public String getWxJoinList(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");

        int totalSize = wXService.getWxJoinCount();
        List<WxJoinInfo> list = wXService.getWxJoinList(curPage, pageSize);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "weixin/getWxSignList");
        return "weixin/joinuplist";
    }
}
