package com.klxc.dao;

import com.klxc.pojo.PlaceClass;

import java.util.List;

public interface PClassMapper {

	 int getClassCount();
	
	 PlaceClass getClassInfo(int id);
	
	 List<PlaceClass> getClassList(int start, int size);
	
	 void uptClass(PlaceClass pClass) throws Exception;
	
	 void addClass(PlaceClass pClass) throws Exception;
	
	 void delClass(int id) throws Exception;
	
}
