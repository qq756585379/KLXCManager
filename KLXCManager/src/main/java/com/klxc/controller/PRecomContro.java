package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.klxc.common.Const;
import com.klxc.pojo.PlaceClass;
import com.klxc.service.PRecomService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.page.PageTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/precom")
public class PRecomContro {

    @Autowired
    private PRecomService pRecomService;

    private int pageSize = Const.pageSize20;

    @RequestMapping("/getRecomClassList")
    public String getRecomClassList(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");

        int totalSize = pRecomService.getRecomCount();
        request.setAttribute("size", totalSize);
        List<PlaceClass> list = pRecomService.getRecomList(curPage, pageSize);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "precom/getRecomClassList");
        return "pclass/recomclasslist";
    }

    @RequestMapping("/delRecomClass")
    public String delRecomClass(HttpServletRequest request) {
        int rid = RequestTool.getInt(request, "rid");
        pRecomService.delRecomClass(rid);
        return "redirect:/precom/getRecomClassList";
    }
}
