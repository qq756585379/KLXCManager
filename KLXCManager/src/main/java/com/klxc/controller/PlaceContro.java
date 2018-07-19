package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.klxc.common.Const;
import com.klxc.pojo.CityData;
import com.klxc.pojo.PlaceInfo;
import com.klxc.service.PlaceService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.UtilTool;
import com.klxc.tool.file.FileTool;
import com.klxc.tool.page.PageTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("/place")
public class PlaceContro {

    @Autowired
    private PlaceService placeService;

    private int pageSize = Const.pageSize20;

    @RequestMapping("/toPlaceAdd")
    public String toAddPlace() {
        return "place/placeadd";
    }

    @RequestMapping("/toPlaceEdit")
    public String toPlaceEdit(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        PlaceInfo info = placeService.getPlaceInfo(id);
        request.setAttribute("info", info);
        return "place/placeedit";
    }


    @RequestMapping("/getPlaceList")
    public String getPlaceList(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");

        int totalSize = placeService.getPlaceCount();
        List<PlaceInfo> list = placeService.getPlaceList(curPage, pageSize);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "place/getPlaceList");
        return "place/placelist";
    }

    @RequestMapping("/getPlaceInfo")
    public String getPlaceInfo(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        PlaceInfo info = placeService.getPlaceInfo(id);
        request.setAttribute("info", info);
        return "place/placeinfo";
    }

    @RequestMapping("/addPlace")
    public String addPlace(@RequestParam("url1") MultipartFile file,
                           @RequestParam("url2") MultipartFile file1,
                           @RequestParam("url3") MultipartFile file2,
                           HttpServletRequest request) {

        PlaceInfo info = new PlaceInfo();
        RequestTool.populate(request, info);

        String province = RequestTool.getString(request, "province");
        String city = RequestTool.getString(request, "city");
        String area = RequestTool.getString(request, "area");
        info.setCity(CityData.getCityName(province, city));
        info.setArea(area);

        info.setImg_url1(FileTool.getFileName(file));
        info.setImg_url2(FileTool.getFileName(file1));
        info.setImg_url3(FileTool.getFileName(file2));

        MultipartFile[] files = new MultipartFile[3];
        files[0] = file;
        files[1] = file1;
        files[2] = file2;
        boolean succ = FileTool.filesUpload(files);
        if (succ) {
            placeService.addPlace(info);
        }
        return "redirect:/place/getPlaceList";
    }

    @RequestMapping("/uptPlace")
    public String uptPlace(@RequestParam("url1") MultipartFile file,
                           @RequestParam("url2") MultipartFile file1,
                           @RequestParam("url3") MultipartFile file2,
                           HttpServletRequest request) {

        PlaceInfo info = new PlaceInfo();
        RequestTool.populate(request, info);

        info.setImg_url1(FileTool.getFileName(file));
        info.setImg_url2(FileTool.getFileName(file1));
        info.setImg_url3(FileTool.getFileName(file2));

        MultipartFile[] files = new MultipartFile[3];
        files[0] = file;
        files[1] = file1;
        files[2] = file2;
        boolean succ = FileTool.filesUpload(files);
        if (succ) {
            placeService.uptPlace(info);
        }
        return "redirect:/place/getPlaceList";
    }

    @RequestMapping("/delPlace")
    public String delPlace(HttpServletRequest request) {
        String idStr = (String) request.getParameter("id");
        int id = UtilTool.toInteger(idStr);
        placeService.delPlace(id);
        return "redirect:/place/getPlaceList";
    }
}
