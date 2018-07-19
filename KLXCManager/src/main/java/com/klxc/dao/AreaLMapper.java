package com.klxc.dao;

import com.klxc.pojo.LeaderInfo;

import java.util.List;

public interface AreaLMapper {

    int getLeaderCount();

    List<LeaderInfo> getLeaderList(int start, int pageSize);

    List<LeaderInfo> getLeaderListById(int start, int pageSize, int userId);

    boolean addLeader(LeaderInfo leader) throws Exception;

    boolean delLeader(int id) throws Exception;
}
