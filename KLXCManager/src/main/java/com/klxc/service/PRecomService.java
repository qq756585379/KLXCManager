package com.klxc.service;

import com.klxc.pojo.OpenCity;
import com.klxc.pojo.PlaceClass;
import com.klxc.pojo.PlaceInfo;
import com.klxc.pojo.RecomClass;

import java.util.List;

public interface PRecomService {
	public int getRecomCount();

	public List<PlaceClass> getRecomList(int page, int pageSize);

	public List<OpenCity> getOpenCity();

	public List<PlaceInfo> getPlaceList(String city);

	public boolean addRecomClass(RecomClass recom);

	public boolean delRecomClass(int id);
}
