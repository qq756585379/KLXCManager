package com.klxc.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.PlaceMapper;
import com.klxc.dao.RecomMapper;
import com.klxc.pojo.OpenCity;
import com.klxc.pojo.PlaceClass;
import com.klxc.pojo.PlaceInfo;
import com.klxc.pojo.RecomClass;
import com.klxc.service.PRecomService;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import com.klxc.util.TimeTool;
import org.springframework.stereotype.Service;

@Service
public class PCalssServiceImpl implements PRecomService {

    @Resource
    private PlaceMapper placeMapper;

    @Resource
    private RecomMapper recomMapper;

    @Override
    public int getRecomCount() {
        return recomMapper.getRecomCount();
    }

    @Override
    public List<PlaceClass> getRecomList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return recomMapper.getRecomList(bean.getStart(), bean.getSize());
    }

    @Override
    public List<OpenCity> getOpenCity() {
        return recomMapper.getOpenCity();
    }

    @Override
    public List<PlaceInfo> getPlaceList(String city) {
        return placeMapper.getPlaceListByCity(city);
    }

    @Override
    public boolean addRecomClass(RecomClass recom) {
        if (recom == null) {
            return false;
        }
        try {
            recom.setCreate_time(TimeTool.formatDateTime(new Date()));
            recomMapper.addRecomClass(recom);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delRecomClass(int id) {
        try {
            recomMapper.delRecomClass(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
