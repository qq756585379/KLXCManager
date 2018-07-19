package com.klxc.dao;

import com.klxc.pojo.Coach;

import java.util.List;

public interface CoachMapper {

    public int getCoachCount();

    public List<Coach> getCoachList(int page, int pageSize);

    public Coach getCoachInfo(int id);

    public void addCoach(Coach coach) throws Exception;

    public void uptCoach(Coach coach) throws Exception;

    public void bingPlaceClass(int id, int place_id, int class_id) throws Exception;

}
