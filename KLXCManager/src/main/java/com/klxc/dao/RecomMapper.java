package com.klxc.dao;

import com.klxc.pojo.OpenCity;
import com.klxc.pojo.PlaceClass;
import com.klxc.pojo.RecomClass;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecomMapper {

    int getRecomCount();

    List<PlaceClass> getRecomList(@Param("page") int page, @Param("pageSize") int pageSize);

    List<OpenCity> getOpenCity();

    List<PlaceClass> getClassListByCity(String city);

    void addRecomClass(RecomClass recom) throws Exception;

    void delRecomClass(int id) throws Exception;

}
