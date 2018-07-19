package com.klxc.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.CoachMapper;
import com.klxc.dao.PlaceMapper;
import com.klxc.dao.RecomMapper;
import com.klxc.pojo.Coach;
import com.klxc.pojo.PlaceClass;
import com.klxc.pojo.PlaceInfo;
import com.klxc.service.CoachService;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import com.klxc.util.TimeTool;
import org.springframework.stereotype.Service;

@Service
public class CoachServiceImpl implements CoachService {

    @Resource
    private CoachMapper coachMapper;

    @Resource
    private PlaceMapper placeMapper;

    @Resource
    private RecomMapper recomMapper;

    @Override
    public int getCoachCount() {
        return coachMapper.getCoachCount();
    }

    @Override
    public List<Coach> getCoachList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return coachMapper.getCoachList(bean.getStart(), bean.getSize());
    }

    @Override
    public Coach getCoachInfo(int id) {
        return coachMapper.getCoachInfo(id);
    }

    @Override
    public boolean addCoach(Coach coach) {
        if (coach == null) {
            return false;
        }
        try {
            coach.setCreate_time(TimeTool.formatDateTime(new Date()));
            coachMapper.addCoach(coach);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean uptCoach(Coach coach) {
        if (coach == null) {
            return false;
        }
        try {
            coachMapper.uptCoach(coach);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public List<PlaceInfo> getPlaceList(String city) {
        return placeMapper.getPlaceListByCity(city);
    }

    @Override
    public List<PlaceClass> getClassListByCity(String city) {
        return recomMapper.getClassListByCity(city);
    }

    @Override
    public boolean bingPlaceClass(int id, int place_id, int class_id) {
        try {
            coachMapper.bingPlaceClass(id, place_id, class_id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
