package com.klxc.dao;

import com.klxc.pojo.OpenCity;
import com.klxc.pojo.PlaceClass;
import com.klxc.pojo.RecomClass;

import java.util.List;

public interface RecomMapper {

    public int getRecomCount();

    public List<PlaceClass> getRecomList(int page, int pageSize);

    public List<OpenCity> getOpenCity();

    public List<PlaceClass> getClassListByCity(String city);

    public void addRecomClass(RecomClass recom) throws Exception;

    public void delRecomClass(int id) throws Exception;

}
