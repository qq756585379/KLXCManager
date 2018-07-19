package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.klxc.common.Const;
import com.klxc.pojo.CityData;
import com.klxc.pojo.PlaceInfo;
import com.klxc.pojo.SchoolInfo;
import com.klxc.service.SchoolService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.UtilTool;
import com.klxc.tool.page.PageTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/school")
public class SchoolContro {

    @Autowired
    private SchoolService schoolService;

    private int pageSize = Const.pageSize20;

    @RequestMapping("/toSchoolAdd")
    public String toSchoolAdd() {
        return "school/schooladd";
    }

    @RequestMapping("/toSchoolBind")
    public String toSchoolBind(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        SchoolInfo info = schoolService.getSchoolInfo(id);
        request.setAttribute("info", info);
        List<PlaceInfo> list = schoolService.getPlaceList(info.getCity());
        request.setAttribute("list", list);
        return "school/schoolbind";
    }

    @RequestMapping("/toSchoolEdit")
    public String toSchoolEdit(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        SchoolInfo info = schoolService.getSchoolInfo(id);
        request.setAttribute("info", info);
        String type = UtilTool.toString(info.getClass_type());
        request.setAttribute("hasType1", type.equals("1") || type.equals("3"));
        request.setAttribute("hasType2", type.equals("2") || type.equals("3"));
        request.setAttribute("hasType11", type.equals("11") || type.equals("13"));
        request.setAttribute("hasType12", type.equals("12") || type.equals("13"));
        return "school/schooledit";
    }

    @RequestMapping("/getSchoolList")
    public String getSchoolList(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");

        int totalSize = schoolService.getSchoolCount();
        List<SchoolInfo> list = schoolService.getSchoolList(curPage, pageSize);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "school/getSchoolList");
        return "school/schoollist";
    }

    @RequestMapping("/addSchool")
    public String addSchool(HttpServletRequest request) {
        SchoolInfo info = new SchoolInfo();
        RequestTool.populate(request, info);

        String province = RequestTool.getString(request, "province");
        String city = RequestTool.getString(request, "city");
        String area = RequestTool.getString(request, "area");
        info.setCity(CityData.getCityName(province, city));
        info.setArea(area);
        schoolService.addSchool(info);
        return "redirect:/school/getSchoolList";
    }

    @RequestMapping("/uptSchool")
    public String uptSchool(HttpServletRequest request) {

        SchoolInfo info = new SchoolInfo();
        RequestTool.populate(request, info);

        schoolService.uptSchool(info);
        return "redirect:/school/getSchoolList";
    }

    @RequestMapping("/bindSchool")
    public String bindSchool(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        int place_id = RequestTool.getInt(request, "place_id");

        schoolService.bindSchool(id, place_id);
        return "redirect:/school/getSchoolList";
    }

    @RequestMapping("/delSchool")
    public String delSchool(HttpServletRequest request) {
        String idStr = (String) request.getParameter("id");
        int id = UtilTool.toInteger(idStr);
        schoolService.delSchool(id);
        return "redirect:/school/getSchoolList";
    }
}
