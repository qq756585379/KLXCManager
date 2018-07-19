package com.klxc.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.klxc.pojo.BannerInfo;
import com.klxc.service.BannerService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.file.FileTool;
import com.klxc.util.TimeTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/banner")
public class BannerContro {

    @Autowired
    private BannerService bannerService;

    @RequestMapping("/getBanner")
    public String getBanner(HttpServletRequest request) {
        List<BannerInfo> list = bannerService.getBannerList();
        request.setAttribute("list", list);
        return "bannerlist";
    }

    @RequestMapping("/addBanner")
    public String addBanner(@RequestParam("url") MultipartFile file, HttpServletRequest request) {
        boolean succ = FileTool.saveFile(file);
        if (succ) {
            BannerInfo banner = new BannerInfo();
            banner.setUrl(FileTool.getFileName(file));
            banner.setCreate_time(TimeTool.formatDateTime(new Date()));
            bannerService.addBanner(banner);
        }
        return "redirect:/banner/getBanner";
    }

    @RequestMapping("/uptBanner")
    public String uptBanner(HttpServletRequest request) {
        BannerInfo banner = new BannerInfo();
        RequestTool.populate(request, banner);
        bannerService.uptBanner(banner);
        return "redirect:/banner/getBanner";
    }

    @RequestMapping("/delBanner")
    public String delBanner(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        bannerService.delBanner(id);
        return "redirect:/banner/getBanner";
    }
}
