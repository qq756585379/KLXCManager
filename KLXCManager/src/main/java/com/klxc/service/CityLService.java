package com.klxc.service;

import com.klxc.pojo.LeaderInfo;

import java.util.List;

public interface CityLService {

    public int getLeaderCount();

    public List<LeaderInfo> getLeaderList(int page, int pageSize);

    public boolean addLeader(LeaderInfo leader);

    public boolean delLeader(int id);
}
