package com.klxc.dao;

import com.klxc.pojo.PlaceClass;

import java.util.List;

public interface PClassMapper {

	public int getClassCount();
	
	public PlaceClass getClassInfo(int id);
	
	public List<PlaceClass> getClassList(int start, int size);
	
	public void uptClass(PlaceClass pClass) throws Exception;
	
	public void addClass(PlaceClass pClass) throws Exception;
	
	public void delClass(int id) throws Exception;
	
}
