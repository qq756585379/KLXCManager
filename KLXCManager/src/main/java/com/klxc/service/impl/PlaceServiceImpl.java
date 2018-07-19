package com.klxc.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.klxc.dao.PlaceMapper;
import com.klxc.pojo.PlaceInfo;
import com.klxc.service.PlaceService;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import com.klxc.util.LngAndLatUtil;
import com.klxc.util.TimeTool;
import org.springframework.stereotype.Service;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Resource
    private PlaceMapper placeMapper;

    @Override
    public int getPlaceCount() {
        return placeMapper.getPlaceCount();
    }

    @Override
    public List<PlaceInfo> getPlaceList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return placeMapper.getPlaceList(bean.getStart(), bean.getSize());
    }

    @Override
    public PlaceInfo getPlaceInfo(int id) {
        return placeMapper.getPlaceInfo(id);
    }

    @Override
    public boolean uptPlace(PlaceInfo place) {
        if (place == null) {
            return false;
        }
        try {
            String address = place.getAddress();
            Map<String, Double> map = LngAndLatUtil.getLngAndLat(address);
            if (map != null) {
                place.setLocation(map.get("lng") + "," + map.get("lat"));
            }
            placeMapper.uptPlace(place);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addPlace(PlaceInfo place) {
        if (place == null) {
            return false;
        }
        try {
            String address = place.getAddress();
            Map<String, Double> map = LngAndLatUtil.getLngAndLat(address);
            if (map != null) {
                place.setLocation(map.get("lng") + "," + map.get("lat"));
            }
            place.setCreate_time(TimeTool.formatDateTime(new Date()));
            placeMapper.addPlace(place);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delPlace(int id) {
        if (id <= 0) {
            return false;
        }
        try {
            placeMapper.delPlace(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
