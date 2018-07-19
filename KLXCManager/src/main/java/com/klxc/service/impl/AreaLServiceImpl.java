package com.klxc.service.impl;

import java.util.Date;
import java.util.List;

import com.klxc.dao.AreaLMapper;
import com.klxc.pojo.LeaderInfo;
import com.klxc.service.AreaLService;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import com.klxc.util.TimeTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaLServiceImpl implements AreaLService {

    @Autowired
    private AreaLMapper areaLMapper;

    @Override
    public int getLeaderCount() {
        return areaLMapper.getLeaderCount();
    }

    @Override
    public List<LeaderInfo> getLeaderList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return areaLMapper.getLeaderList(bean.getStart(), bean.getSize());
    }

    @Override
    public List<LeaderInfo> getLeaderListById(int page, int pageSize, int userId) {
        PageBean bean = Pager.getPage(page, pageSize);
        return areaLMapper.getLeaderListById(bean.getStart(), bean.getSize(), userId);
    }

    @Override
    public boolean addLeader(LeaderInfo leader) {
        if (leader == null) {
            return false;
        }
        try {
            leader.setCreate_time(TimeTool.formatDateTime(new Date()));
            areaLMapper.addLeader(leader);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delLeader(int id) {
        try {
            areaLMapper.delLeader(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
