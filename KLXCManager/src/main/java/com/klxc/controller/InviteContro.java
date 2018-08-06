package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.klxc.common.Const;
import com.klxc.pojo.InviteCode;
import com.klxc.pojo.LeaderInfo;
import com.klxc.pojo.User;
import com.klxc.service.InviteService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.UtilTool;
import com.klxc.tool.page.PageTool;
import com.klxc.util.QrCodeTool;
import com.klxc.vo.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/invite")
public class InviteContro {

    @Autowired
    private InviteService inviteService;

    private int pageSize = Const.pageSize20;

    private final String path_invite_add = "invite/inviteadd";

    @RequestMapping("/toInviteAdd")
    public String toInviteAdd(HttpServletRequest request) {
        int userId = UserData.getUser(request).getId();
        int role = UserData.getUser(request).getRole();

        boolean show = role == 3;

        List<LeaderInfo> list = null;
        if (show) {
            list = inviteService.getCityLListById(userId);
        } else {
            list = inviteService.getAreaLListById(userId);
        }

        if (UtilTool.isExtNull(list)) {
            request.setAttribute("msg", "你还没有成为负责人，无法指定代理人");
        }
        request.setAttribute("list", list);
        request.setAttribute("show", show);
        return path_invite_add;
    }

    @RequestMapping("/getAllInviteList")
    public String getAllInviteList(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");

        int totalSize = inviteService.getInviteCount();
        List<InviteCode> list = inviteService.getInviteList(curPage, pageSize);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "invite/getAllInviteList");
        return "invite/invitealllist";
    }

    @RequestMapping("/getCityInviteList")
    public String getCityInviteList(HttpServletRequest request) {
        int userId = UserData.getUser(request).getId();

        int curPage = RequestTool.getInt(request, "page");

        int totalSize = inviteService.getCityInviteCount(userId);
        List<InviteCode> list = inviteService.getCityInviteList(curPage, pageSize, userId);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "invite/getCityInviteList");
        return "invite/invitelistcity";
    }

    @RequestMapping("/getUserInviteList")
    public String getUserInviteList(HttpServletRequest request) {

        int userId = UserData.getUser(request).getId();

        int curPage = RequestTool.getInt(request, "page");

        int totalSize = inviteService.getInviteCountById(userId);
        List<InviteCode> list = inviteService.getInviteListById(curPage, pageSize, userId);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "invite/getUserInviteList");
        return "invite/invitelistuser";
    }

    @RequestMapping("/addInvite")
    public String addInvite(HttpServletRequest request) {


        String area_name = request.getParameter("area_name");
        if (UtilTool.isNull(area_name)) {
            request.setAttribute("msg", "你还没有负责区域，无法指定代理人");
            int role = UserData.getUser(request).getRole();
            request.setAttribute("show", role == 3);
            return path_invite_add;
        }
        InviteCode info = new InviteCode();
        RequestTool.populate(request, info);
        User user = UserData.getUser(request);
        info.setCreate_id(user.getId());
        info.setCreate_name(user.getNickname());
        inviteService.addInvite(info);
        return "redirect:/invite/getUserInviteList";
    }

    @RequestMapping("/delInvite")
    public String delInvite(HttpServletRequest request) {
        String idStr = (String) request.getParameter("id");
        int id = UtilTool.toInteger(idStr);
        inviteService.delInvite(id);
        return "redirect:/invite/getAllInviteList";
    }

    @RequestMapping("/delUserInvite")
    public String delUserInvite(HttpServletRequest request) {
        String idStr = (String) request.getParameter("id");
        int id = UtilTool.toInteger(idStr);
        inviteService.delInvite(id);
        return "redirect:/invite/getUserInviteList";
    }

    @RequestMapping("/delCityInvite")
    public String delCityInvite(HttpServletRequest request) {
        String idStr = (String) request.getParameter("id");
        int id = UtilTool.toInteger(idStr);
        inviteService.delInvite(id);
        return "redirect:/invite/getCityInviteList";
    }

    @RequestMapping("/createQr")
    public String createQr(HttpServletRequest request) {
        String code = (String) request.getParameter("code");
        String img_url = QrCodeTool.createQr(code);
        request.setAttribute("img_url", img_url);
        return "invite/inviteqrcode";
    }
}
