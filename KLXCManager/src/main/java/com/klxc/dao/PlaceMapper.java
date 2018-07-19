package com.klxc.dao;

import com.klxc.pojo.PlaceInfo;

import java.util.List;

public interface PlaceMapper {

	public int getPlaceCount();
	
	public List<PlaceInfo> getPlaceList(int start, int size);
	
	public List<PlaceInfo> getPlaceListByCity(String city);
	
	public PlaceInfo getPlaceInfo(int id);

	public void uptPlace(PlaceInfo place) throws Exception;
	
	public void addPlace(PlaceInfo place) throws Exception;
	
	public void delPlace(int id) throws Exception;

}
