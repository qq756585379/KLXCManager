package com.klxc.dao;

import com.klxc.pojo.LeaderInfo;

import java.util.List;

public interface LeaderMapper {

    public List<LeaderInfo> getCityLListById(int userId);

    public List<LeaderInfo> getAreaLListById(int userId);
}
