package com.klxc.dao;

import com.klxc.pojo.Coach;

import java.util.List;

public interface CoachMapper {

    int getCoachCount();

    List<Coach> getCoachList(int page, int pageSize);

    Coach getCoachInfo(int id);

    void addCoach(Coach coach) throws Exception;

    void uptCoach(Coach coach) throws Exception;

    void bingPlaceClass(int id, int place_id, int class_id) throws Exception;

}
