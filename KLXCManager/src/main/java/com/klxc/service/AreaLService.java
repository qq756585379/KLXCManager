package com.klxc.service;

import com.klxc.pojo.LeaderInfo;

import java.util.List;

public interface AreaLService {

    int getLeaderCount();

    List<LeaderInfo> getLeaderList(int page, int pageSize);

    List<LeaderInfo> getLeaderListById(int page, int pageSize, int userId);

    boolean addLeader(LeaderInfo leader);

    boolean delLeader(int id);
}
