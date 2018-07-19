package com.klxc.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.PClassMapper;
import com.klxc.dao.PlaceMapper;
import com.klxc.dao.RecomMapper;
import com.klxc.pojo.PlaceClass;
import com.klxc.service.PClassService;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import com.klxc.util.TimeTool;
import org.springframework.stereotype.Service;

@Service
public class PRecomServiceImpl implements PClassService {

    @Resource
    private PClassMapper pClassMapper;

    @Resource
    private PlaceMapper placeMapper;

    @Resource
    private RecomMapper recomMapper;

    @Override
    public int getClassCount() {
        return pClassMapper.getClassCount();
    }

    @Override
    public PlaceClass getClassInfo(int id) {
        return pClassMapper.getClassInfo(id);
    }

    @Override
    public List<PlaceClass> getClassList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return pClassMapper.getClassList(bean.getStart(), bean.getSize());
    }

    @Override
    public boolean uptClass(PlaceClass pClass) {
        if (pClass == null) {
            return false;
        }
        try {
            pClassMapper.uptClass(pClass);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addClass(PlaceClass pClass) {
        if (pClass == null) {
            return false;
        }
        try {
            pClass.setCreate_time(TimeTool.formatDateTime(new Date()));
            pClassMapper.addClass(pClass);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delClass(int id) {
        try {
            pClassMapper.delClass(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
