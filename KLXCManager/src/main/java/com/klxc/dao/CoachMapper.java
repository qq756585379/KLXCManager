package com.klxc.dao;

import com.klxc.pojo.Coach;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoachMapper {

    int getCoachCount();

    List<Coach> getCoachList(@Param("page") int page, @Param("pageSize") int pageSize);

    Coach getCoachInfo(int id);

    void addCoach(Coach coach) throws Exception;

    void uptCoach(Coach coach) throws Exception;

    void bingPlaceClass(@Param("id") int id, @Param("place_id") int place_id, @Param("class_id") int class_id) throws Exception;
}
