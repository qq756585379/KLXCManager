package com.klxc.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.SchoolMapper;
import com.klxc.dao.StudentMapper;
import com.klxc.pojo.CoachBean;
import com.klxc.pojo.SchoolInfo;
import com.klxc.pojo.StudentInfo;
import com.klxc.service.StudentService;
import com.klxc.tool.UtilTool;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private SchoolMapper schoolMapper;

    @Override
    public int getStudentCount() {
        return studentMapper.getStudentCount();
    }

    @Override
    public List<StudentInfo> getStudentList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return studentMapper.getStudentList(bean.getStart(), bean.getSize());
    }

    @Override
    public StudentInfo getStudentInfo(int id) {
        return studentMapper.getStudentInfo(id);
    }

    @Override
    public boolean uptStudent(StudentInfo info) {
        if (info == null) {
            return false;
        }
        try {
            studentMapper.uptStudent(info);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<SchoolInfo> getSchoolListById(int place_id) {
        return schoolMapper.getSchoolListById(place_id);
    }

    @Override
    public List<CoachBean> getCoachList(List<SchoolInfo> schList) {
        if (UtilTool.isExtNull(schList)) {
            return new ArrayList<>();
        }
        List<String> names = new ArrayList<>();
        for (SchoolInfo info : schList) {
            names.add(info.getName());
        }
        return studentMapper.getCoachList(names);
    }
}
