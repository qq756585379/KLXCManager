package com.klxc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.klxc.common.Const;
import com.klxc.pojo.CoachBean;
import com.klxc.pojo.SchoolInfo;
import com.klxc.pojo.StudentInfo;
import com.klxc.service.StudentService;
import com.klxc.tool.RequestTool;
import com.klxc.tool.UtilTool;
import com.klxc.tool.page.PageTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentContro {

    @Autowired
    private StudentService studentService;

    private int pageSize = Const.pageSize20;

    @RequestMapping("/getAllStudentList")
    public String getAllStudentList(HttpServletRequest request) {
        int curPage = RequestTool.getInt(request, "page");
        int totalSize = studentService.getStudentCount();
        List<StudentInfo> list = studentService.getStudentList(curPage, pageSize);
        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "student/getAllStudentList");
        return "student/studentalllist";
    }

    @RequestMapping("/toStudentEdit")
    public String toStudentEdit(HttpServletRequest request) {
        int id = RequestTool.getInt(request, "id");
        StudentInfo info = studentService.getStudentInfo(id);
        request.setAttribute("info", info);
        if (info != null) {
            List<SchoolInfo> schList = studentService.getSchoolListById(info.getPlace_id());
            request.setAttribute("schList", schList);
            List<CoachBean> coaList = studentService.getCoachList(schList);
            setCoach(schList, coaList, request);
        }
        return "student/studentedit";
    }

    private void setCoach(List<SchoolInfo> schList, List<CoachBean> coaList, HttpServletRequest request) {
        String schname = "";
        if (!UtilTool.isExtNull(schList)) {
            schname = UtilTool.toString(schList.get(0).getName());
        }
        if (!UtilTool.isExtNull(coaList)) {
            int len = coaList.size();
            String ids = "";
            String names = "";
            String schnames = "";
            List<CoachBean> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                CoachBean bean = coaList.get(i);
                ids += "," + bean.getCoach_id();
                names += "," + bean.getCoach_name();
                schnames += "," + bean.getCoach_school_name();
                if (schname.equals(bean.getCoach_school_name())) {
                    list.add(bean);
                }
            }
            ids = ids.replaceFirst(",", "");
            names = names.replaceFirst(",", "");
            schnames = schnames.replaceFirst(",", "");

            request.setAttribute("ids", ids);
            request.setAttribute("names", names);
            request.setAttribute("schnames", schnames);
            request.setAttribute("coaList", list);
        }
    }

    @RequestMapping("/uptStudent")
    public String uptStudent(HttpServletRequest request) {
        int tid = RequestTool.getInt(request, "tid");
        int coach_id = RequestTool.getInt(request, "coach_id");
        StudentInfo info = new StudentInfo();
        info.setTid(tid);
        info.setCoach_id(coach_id);
        studentService.uptStudent(info);
        return "redirect:/student/getAllStudentList";
    }
}
