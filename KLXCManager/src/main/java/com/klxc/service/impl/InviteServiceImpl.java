package com.klxc.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.InviteMapper;
import com.klxc.dao.LeaderMapper;
import com.klxc.pojo.InviteCode;
import com.klxc.pojo.LeaderInfo;
import com.klxc.service.InviteService;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import com.klxc.util.Conver;
import com.klxc.util.TimeTool;
import org.springframework.stereotype.Service;

@Service
public class InviteServiceImpl implements InviteService {

    @Resource
    private InviteMapper inviteMapper;

    @Resource
    private LeaderMapper leaderMapper;

    @Override
    public int getInviteCount() {
        return inviteMapper.getInviteCount();
    }

    @Override
    public List<InviteCode> getInviteList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        List<InviteCode> list = inviteMapper.getInviteList(bean.getStart(), bean.getSize());
        Conver c = Conver.getInstance();
        for (InviteCode inviteCode : list) {
            inviteCode.setCode(c.encode(inviteCode.getId() + ""));
        }
        return list;
    }

    @Override
    public int getCityInviteCount(int userId) {
        return inviteMapper.getCityInviteCount(userId);
    }

    @Override
    public List<InviteCode> getCityInviteList(int page, int pageSize, int userId) {
        PageBean bean = Pager.getPage(page, pageSize);
        List<InviteCode> list = inviteMapper.getCityInviteList(bean.getStart(), bean.getSize(), userId);
        Conver c = Conver.getInstance();
        for (InviteCode inviteCode : list) {
            inviteCode.setCode(c.encode(inviteCode.getId() + ""));
        }
        return list;
    }

    @Override
    public int getInviteCountById(int userId) {
        return inviteMapper.getInviteCountById(userId);
    }

    @Override
    public List<InviteCode> getInviteListById(int page, int pageSize, int userId) {
        PageBean bean = Pager.getPage(page, pageSize);
        List<InviteCode> list = inviteMapper.getInviteListById(bean.getStart(), bean.getSize(), userId);
        Conver c = Conver.getInstance();
        for (InviteCode inviteCode : list) {
            inviteCode.setCode(c.encode(inviteCode.getId() + ""));
        }
        return list;
    }

    @Override
    public boolean addInvite(InviteCode invite) {
        if (invite == null) {
            return false;
        }
        try {
            invite.setCreate_time(TimeTool.formatDateTime(new Date()));
            inviteMapper.addInvite(invite);
            String code = invite.getType() + Conver.getInstance().encode(invite.getId() + "");
            inviteMapper.uptInvite(invite.getId(), code);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delInvite(int id) {
        try {
            inviteMapper.delInvite(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<LeaderInfo> getCityLListById(int userId) {
        return leaderMapper.getCityLListById(userId);
    }

    @Override
    public List<LeaderInfo> getAreaLListById(int userId) {
        return leaderMapper.getAreaLListById(userId);
    }

}
