package com.klxc.service;

import com.klxc.pojo.PlaceInfo;

import java.util.List;

public interface PlaceService {
	
	public int getPlaceCount();
	
	public List<PlaceInfo> getPlaceList(int page, int pageSize);
	
	public PlaceInfo getPlaceInfo(int id);

	public boolean uptPlace(PlaceInfo place);

	public boolean addPlace(PlaceInfo place);

	public boolean delPlace(int id);
}
