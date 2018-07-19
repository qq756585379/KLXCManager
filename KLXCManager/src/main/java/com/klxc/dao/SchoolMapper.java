package com.klxc.dao;

import com.klxc.pojo.SchoolInfo;

import java.util.List;

public interface SchoolMapper {

	public int getSchoolCount();

	public List<SchoolInfo> getSchoolList(int start, int size);
	
	public List<SchoolInfo> getSchoolListById(int place_id);

	public SchoolInfo getSchoolInfo(int id);
	
	public List<SchoolInfo> getSchoolNameList();

	public void uptSchool(SchoolInfo School) throws Exception;

	public void addSchool(SchoolInfo School) throws Exception;
	
	public void bindSchool(int id, int place_id) throws Exception;

	public void delSchool(int id) throws Exception;

}
