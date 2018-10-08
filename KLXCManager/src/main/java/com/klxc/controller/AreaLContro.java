package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.klxc.common.Const;
import com.klxc.pojo.CityData;
import com.klxc.pojo.LeaderInfo;
import com.klxc.pojo.User;
import com.klxc.service.AreaLService;
import com.klxc.service.UserService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.UtilTool;
import com.klxc.tool.page.PageTool;
import com.klxc.vo.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/leaderarea")
public class AreaLContro {

    @Autowired
    private AreaLService areaLService;

    @Autowired
    private UserService userService;

    private int pageSize = Const.pageSize20;

    private final String path_leader_add = "leader/arealeaderadd";

    private final String path_leader_list = "leaderarea/getLeaderList";

    @RequestMapping("/toAddLeader")
    public String toAddCityLeader(HttpServletRequest request) {
        return path_leader_add;
    }

    @RequestMapping("/searchByName")
    public String searchByName(HttpServletRequest request) {
        String nickName = RequestTool.getStringEncode(request, "nickName");
        List<User> list = userService.getUserInfo(nickName);
        request.setAttribute("list", list);
        request.setAttribute("nickName", nickName);
        return path_leader_add;
    }

    @RequestMapping("/getLeaderList")
    public String getLeaderList(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");
        int totalSize = areaLService.getLeaderCount();
        List<LeaderInfo> list = areaLService.getLeaderList(curPage, pageSize);

        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, path_leader_list);
        return "leader/arealeaderlist";
    }

    @RequestMapping("/getLeaderListById")
    public String getLeaderListById(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");
        int userId = UserData.getUser(request).getId();
        int totalSize = areaLService.getLeaderCount();
        List<LeaderInfo> list = areaLService.getLeaderListById(curPage, pageSize, userId);

        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "leaderarea/getLeaderListById");
        return "leader/arealeaderlist";
    }

    @RequestMapping("/addLeader")
    public String addLeader(HttpServletRequest request) {
        String province = RequestTool.getString(request, "province");
        String city = RequestTool.getString(request, "city");
        String area = RequestTool.getString(request, "area");
        String userinfo = RequestTool.getString(request, "userinfo");
        int userId = 0;
        String nickName = "";
        String phone = "";
        if (!UtilTool.isNull(userinfo)) {
            String[] str = userinfo.split(",");
            if (str != null && str.length >= 3) {
                userId = UtilTool.toInteger(str[0]);
                nickName = str[1];
                phone = str[2];
            }
        }

        if (userId <= 0) {
            return path_leader_add;
        }

        LeaderInfo leader = new LeaderInfo();
        leader.setCity(CityData.getCityName(province, city));
        leader.setArea(area);
        leader.setUser_id(userId);
        leader.setUser_name(nickName);
        leader.setUser_phone(phone);
        User user = UserData.getUser(request);
        leader.setCreate_id(user.getId());

        boolean succ = areaLService.addLeader(leader);
        if (!succ) {
            return path_leader_add;
        }
        return "redirect:/" + path_leader_list;
    }

    @RequestMapping("/delLeader")
    public String delCityLeader(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        areaLService.delLeader(id);
        return "redirect:/" + path_leader_list;
    }
}
