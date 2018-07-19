package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.klxc.common.Const;
import com.klxc.pojo.*;
import com.klxc.service.PClassService;
import com.klxc.service.PRecomService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.UtilTool;
import com.klxc.tool.page.PageTool;
import com.klxc.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;

import java.util.List;

@Controller
@RequestMapping("/pclass")
public class PClassContro {

    @Autowired
    private PClassService pClassService;

    @Autowired
    private PRecomService pRecomService;

    private int pageSize = Const.pageSize20;

    @RequestMapping("/toClassAdd")
    public String toClassAdd(HttpServletRequest request) {
        String city = RequestTool.getStringEncode(request, "city");
        if (UtilTool.isNull(city)) {
            city = "上海";
        }
        List<OpenCity> cityList = pRecomService.getOpenCity();
        request.setAttribute("cityList", cityList);
        List<PlaceInfo> placelist = pRecomService.getPlaceList(city);
        request.setAttribute("placelist", placelist);
        return "pclass/classadd";
    }

    @RequestMapping("/getPlaceList")
    public void getPlaceList(HttpServletRequest request, HttpServletResponse response) {
        String city = RequestTool.getStringEncode(request, "city");
        if (UtilTool.isNull(city)) {
            city = "上海";
        }
        List<PlaceInfo> placelist = pRecomService.getPlaceList(city);
        String jsonResult = JSON.toJSONString(placelist);
        JsonData.renderData(response, jsonResult);
    }

    @RequestMapping("/toClassEdit")
    public String toClassEdit(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        PlaceClass info = pClassService.getClassInfo(id);
        request.setAttribute("info", info);
        String city = "";
        if (info != null) {
            city = info.getCity();
        }
        List<PlaceInfo> placelist = pRecomService.getPlaceList(city);
        request.setAttribute("placelist", placelist);
        return "pclass/classedit";
    }

    @RequestMapping("/getClassList")
    public String getClassList(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");

        int totalSize = pClassService.getClassCount();
        request.setAttribute("size", totalSize);
        List<PlaceClass> list = pClassService.getClassList(curPage, pageSize);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "pclass/getClassList");
        return "pclass/classlist";
    }

    @RequestMapping("/addClass")
    public String addClass(HttpServletRequest request) {

        PlaceClass info = new PlaceClass();
        RequestTool.populate(request, info);

        String province = RequestTool.getString(request, "province");
        String city = RequestTool.getString(request, "city");
        info.setCity(CityData.getCityName(province, city));
        pClassService.addClass(info);
        return "redirect:/pclass/getClassList";
    }

    @RequestMapping("/uptClass")
    public String uptClass(HttpServletRequest request) {

        PlaceClass info = new PlaceClass();
        RequestTool.populate(request, info);

        pClassService.uptClass(info);
        return "redirect:/pclass/getClassList";
    }

    @RequestMapping("/delClass")
    public String delClass(HttpServletRequest request) {
        String idStr = (String) request.getParameter("id");
        int id = UtilTool.toInteger(idStr);
        pClassService.delClass(id);
        return "redirect:/pclass/getClassList";
    }

    @RequestMapping("/addRecomClass")
    public String addRecomClass(HttpServletRequest request) {
        String city = RequestTool.getStringEncode(request, "city");
        int id = RequestTool.getInt(request, "id");
        RecomClass info = new RecomClass();
        info.setCity(city);
        info.setClass_id(id);
        pRecomService.addRecomClass(info);
        return "redirect:/pclass/getClassList";
    }
}
