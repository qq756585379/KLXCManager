package com.klxc.service;

import com.klxc.pojo.InviteCode;
import com.klxc.pojo.LeaderInfo;

import java.util.List;

public interface InviteService {

    public int getInviteCount();

    public List<InviteCode> getInviteList(int page, int pageSize);

    public int getCityInviteCount(int userId);

    public List<InviteCode> getCityInviteList(int page, int pageSize, int userId);

    public int getInviteCountById(int userId);

    public List<InviteCode> getInviteListById(int page, int pageSize, int userId);

    public boolean addInvite(InviteCode invite);

    public boolean delInvite(int id);

    public List<LeaderInfo> getCityLListById(int userId);

    public List<LeaderInfo> getAreaLListById(int userId);

}
