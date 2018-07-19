package com.klxc.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.PlaceMapper;
import com.klxc.dao.SchoolMapper;
import com.klxc.pojo.PlaceInfo;
import com.klxc.pojo.SchoolData;
import com.klxc.pojo.SchoolInfo;
import com.klxc.service.SchoolService;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import com.klxc.util.TimeTool;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Resource
    private SchoolMapper schoolMapper;

    @Resource
    private PlaceMapper placeMapper;

    @Override
    public int getSchoolCount() {
        return schoolMapper.getSchoolCount();
    }

    @Override
    public SchoolInfo getSchoolInfo(int id) {
        return schoolMapper.getSchoolInfo(id);
    }

    @Override
    public List<SchoolInfo> getSchoolList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return schoolMapper.getSchoolList(bean.getStart(), bean.getSize());
    }

    @Override
    public boolean uptSchool(SchoolInfo school) {
        if (school == null) {
            return false;
        }
        try {
            school.setClassType(SchoolData.getClassType(school.getClass_type(), school.getType()));
            schoolMapper.uptSchool(school);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addSchool(SchoolInfo school) {
        if (school == null) {
            return false;
        }
        try {
            school.setClassType(SchoolData.getClassType(school.getClass_type(), school.getType()));
            school.setCreate_time(TimeTool.formatDateTime(new Date()));
            schoolMapper.addSchool(school);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delSchool(int id) {
        try {
            schoolMapper.delSchool(id);
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
    public boolean bindSchool(int id, int place_id) {
        try {
            schoolMapper.bindSchool(id, place_id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
