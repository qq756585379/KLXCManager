package com.klxc.service;

import com.klxc.pojo.Coach;
import com.klxc.pojo.PlaceClass;
import com.klxc.pojo.PlaceInfo;

import java.util.List;

public interface CoachService {

    int getCoachCount();

    List<Coach> getCoachList(int page, int pageSize);

    Coach getCoachInfo(int id);

    boolean addCoach(Coach coach);

    boolean uptCoach(Coach coach);

    List<PlaceInfo> getPlaceList(String city);

    List<PlaceClass> getClassListByCity(String city);

    boolean bingPlaceClass(int id, int place_id, int class_id);
}
