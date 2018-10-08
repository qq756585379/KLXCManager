package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.klxc.common.Const;
import com.klxc.pojo.CityData;
import com.klxc.pojo.Coach;
import com.klxc.pojo.PlaceClass;
import com.klxc.pojo.PlaceInfo;
import com.klxc.service.CoachService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.UtilTool;
import com.klxc.tool.file.FileTool;
import com.klxc.tool.page.PageTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/coach")
public class CoachContro {

    @Autowired
    private CoachService coachService;

    private int pageSize = Const.pageSize20;

    @RequestMapping("/toAddCoach")
    public String toAddCoach(HttpServletRequest request) {
        return "coach/coachadd";
    }

    @RequestMapping("/toApprove")
    public String toApprove(HttpServletRequest request) {
        return "coach/coachadd";
    }

    @RequestMapping("/getCoach")
    public String getCoach(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");
        int totalSize = coachService.getCoachCount();
        List<Coach> list = coachService.getCoachList(curPage, pageSize);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "coach/getCoach");
        return "coach/coachlist";
    }

    @RequestMapping("/toCoachEdit")
    public String toCoachEdit(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        Coach coach = coachService.getCoachInfo(id);
        request.setAttribute("coach", coach);
        return "coach/coachedit";
    }

    @RequestMapping("/addCoach")
    public String addCoachTemp(@RequestParam("coach_favicon_url") MultipartFile file, HttpServletRequest request) {
        Coach coach = new Coach();
        RequestTool.populate(request, coach);

        String province = RequestTool.getString(request, "province");
        String city = RequestTool.getString(request, "city");
        String area = RequestTool.getString(request, "area");

        coach.setCoach_city(CityData.getCityName(province, city));
        coach.setCoach_area(area);
        coach.setCoach_favicon_url(FileTool.getFileName(file));

        boolean succ = FileTool.saveFile(file);
        if (succ) {
            coachService.addCoach(coach);
        }
        return "redirect:/coach/getCoach";
    }

    @RequestMapping("/uptCoach")
    public String uptCoach(@RequestParam("coach_favicon_url") MultipartFile file, HttpServletRequest request) {
        Coach coach = new Coach();
        RequestTool.populate(request, coach);
        coach.setCoach_favicon_url(FileTool.getFileName(file));
        boolean succ = FileTool.saveFile(file);
        if (succ) {
            coachService.uptCoach(coach);
        }
        return "redirect:/coach/getCoach";
    }

    @RequestMapping("/toBind")
    public String toBind(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        String city = request.getParameter("city");
        // String city = RequestTool.getStringEncode(request, "city");
        if (UtilTool.isNull(city)) {
            city = "上海";
        }
        request.setAttribute("id", id);
        request.setAttribute("city", city);
        List<PlaceInfo> placelist = coachService.getPlaceList(city);
        List<PlaceClass> clssList = coachService.getClassListByCity(city);

        request.setAttribute("placelist", placelist);
        request.setAttribute("clssList", clssList);
        return "coach/bindplaceclass";
    }

    @RequestMapping("/bindPlaceClass")
    public String bindPlaceClass(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        int place_id = RequestTool.getInt(request, "place_id");
        int class_id = RequestTool.getInt(request, "class_id");
        coachService.bingPlaceClass(id, place_id, class_id);
        return "redirect:/coach/getCoach";
    }

    @RequestMapping("/coachInfo")
    public String coachInfo(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        Coach coach = coachService.getCoachInfo(id);
        request.setAttribute("coach", coach);
        return "coach/coachinfo";
    }
}
