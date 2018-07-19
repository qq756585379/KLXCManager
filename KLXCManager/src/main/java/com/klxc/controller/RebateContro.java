package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.klxc.common.Const;
import com.klxc.pojo.CityData;
import com.klxc.pojo.CityRebate;
import com.klxc.service.RebateService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.page.PageTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/rebate")
public class RebateContro {

    @Autowired
    private RebateService rebateService;

    private int pageSize = Const.pageSize10;

    @RequestMapping("/toAddRebate")
    public String toAddAreaLeader(HttpServletRequest request) {
        return "cityrebateadd";
    }

    @RequestMapping("/getCityRebate")
    public String getCityRebate(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");

        int totalSize = rebateService.getCount();
        List<CityRebate> list = rebateService.getCityRebateList(curPage, pageSize);

        request.setAttribute("list", list);
        PageTool.setPage10(request, totalSize, curPage, "rebate/getCityRebate");
        return "cityrebatelist";
    }

    @RequestMapping("/addRebate")
    public String addRebate(HttpServletRequest request) {
        String province = RequestTool.getString(request, "province");
        String city = RequestTool.getString(request, "city");
//		String area = RequestTool.getString(request, "area");
        float city_rebate = RequestTool.getFloat(request, "city_rebate");
        CityRebate rebate = new CityRebate();
        rebate.setCity_name(CityData.getCityName(province, city));
        rebate.setCity_rebate(city_rebate);

        boolean succ = rebateService.addCityRebate(rebate);
        if (!succ) {
            return "cityrebateadd";
        }
        return "redirect:/rebate/getCityRebate";
    }

    @RequestMapping("/delRebate")
    public String delRebate(HttpServletRequest request) {
        int tid = RequestTool.getInt(request, "tid");
        rebateService.delRebate(tid);
        return "redirect:/rebate/getCityRebate";
    }
}
