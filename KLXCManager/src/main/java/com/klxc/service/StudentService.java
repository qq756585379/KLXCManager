package com.klxc.service;

import com.klxc.pojo.CoachBean;
import com.klxc.pojo.SchoolInfo;
import com.klxc.pojo.StudentInfo;

import java.util.List;

public interface StudentService {
	
	public int getStudentCount();
	
	public List<StudentInfo> getStudentList(int page, int pageSize);
	
	public StudentInfo getStudentInfo(int id);
	
	public boolean uptStudent(StudentInfo info);
	
	public List<SchoolInfo> getSchoolListById(int place_id);
	
	public List<CoachBean> getCoachList(List<SchoolInfo> schList);
}
