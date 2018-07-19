package com.klxc.service;

import com.klxc.pojo.PlaceClass;

import java.util.List;

public interface PClassService {
	
	public int getClassCount();
	
	public PlaceClass getClassInfo(int id);
	
	public List<PlaceClass> getClassList(int page, int pageSize);
	
	public boolean uptClass(PlaceClass pClass);
	
	public boolean addClass(PlaceClass pClass);
	
	public boolean delClass(int id);
}