package com.klxc.service;

import com.klxc.pojo.PlaceInfo;
import com.klxc.pojo.SchoolInfo;

import java.util.List;

public interface SchoolService {

    public int getSchoolCount();

    public SchoolInfo getSchoolInfo(int id);

    public List<PlaceInfo> getPlaceList(String city);

    public List<SchoolInfo> getSchoolList(int page, int pageSize);

    public boolean uptSchool(SchoolInfo school);

    public boolean addSchool(SchoolInfo school);

    public boolean bindSchool(int id, int place_id);

    public boolean delSchool(int id);
}
