package com.klxc.dao;

import com.klxc.pojo.LeaderInfo;

import java.util.List;

public interface LeaderMapper {

     List<LeaderInfo> getCityLListById(int userId);

     List<LeaderInfo> getAreaLListById(int userId);
}
