package com.klxc.dao;

import com.klxc.pojo.LeaderInfo;

import java.util.List;

public interface CityLMapper {

    int getLeaderCount();

    List<LeaderInfo> getLeaderList(int start, int pageSize);

    List<LeaderInfo> getLeaderListById(int userId);

    boolean addLeader(LeaderInfo leader) throws Exception;

    boolean delLeader(int id) throws Exception;
}
