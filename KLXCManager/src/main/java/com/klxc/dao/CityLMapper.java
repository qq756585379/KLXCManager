package com.klxc.dao;

import com.klxc.pojo.LeaderInfo;

import java.util.List;

public interface CityLMapper {

    public int getLeaderCount();

    public List<LeaderInfo> getLeaderList(int start, int pageSize);

    public List<LeaderInfo> getLeaderListById(int userId);

    public boolean addLeader(LeaderInfo leader) throws Exception;

    public boolean delLeader(int id) throws Exception;
}
