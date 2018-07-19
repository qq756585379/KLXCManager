package com.klxc.service;

import com.klxc.pojo.Coach;
import com.klxc.pojo.PlaceClass;
import com.klxc.pojo.PlaceInfo;

import java.util.List;

public interface CoachService {

    public int getCoachCount();

    public List<Coach> getCoachList(int page, int pageSize);

    public Coach getCoachInfo(int id);

    public boolean addCoach(Coach coach);

    public boolean uptCoach(Coach coach);

    public List<PlaceInfo> getPlaceList(String city);

    public List<PlaceClass> getClassListByCity(String city);

    public boolean bingPlaceClass(int id, int place_id, int class_id);
}
