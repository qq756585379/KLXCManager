package com.klxc.dao;

import com.klxc.pojo.CoachBean;
import com.klxc.pojo.StudentInfo;

import java.util.List;

public interface StudentMapper {

	public int getStudentCount();

	public List<StudentInfo> getStudentList(int start, int size);
	
	public StudentInfo getStudentInfo(int id);
	
	public List<CoachBean> getCoachList(List<String> names);
	
	public void uptStudent(StudentInfo info) throws Exception;

}
