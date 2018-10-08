package com.klxc.dao;

import com.klxc.pojo.PlaceInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlaceMapper {

    int getPlaceCount();

    List<PlaceInfo> getPlaceList(@Param("start") int start, @Param("size") int size);

    List<PlaceInfo> getPlaceListByCity(String city);

    PlaceInfo getPlaceInfo(int id);

    void uptPlace(PlaceInfo place) throws Exception;

    void addPlace(PlaceInfo place) throws Exception;

    void delPlace(int id) throws Exception;

}
