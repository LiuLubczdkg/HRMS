package com.controller;

import com.model.Department;
import com.model.Job;
import com.model.Recruitment;
import com.service.DepartmentService;
import com.service.JobService;
import com.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RecruitmentController {

    @Resource
    private RecruitmentService recruitmentService;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private JobService jobService;
    @RequestMapping(value="/addre")
    public String addre(HttpSession session){
        List<Job> job=jobService.Alljob();
        List<Department> departments=departmentService.AllDepartment();
        session.setAttribute("alljob",job);
        session.setAttribute("alldepa",departments);
        return "addre";
    }
    @RequestMapping(value = "/addRecruitment")
    public String addRecruitment(Recruitment recruitment, HttpServletRequest request){
        Recruitment recruitment1=recruitmentService.selectRecruitByDJ(recruitment);
        if (null==recruitment1){
            recruitmentService.addRecruitment(recruitment);
            return "admin";
        }
        return "wrong";
    }
    @RequestMapping(value = "/updateRecruitment")
    public String updateRecruitment(Recruitment recruitment, HttpServletRequest request){
        List<Recruitment> recruitment1= recruitmentService.AllRecruitment();
        for (Recruitment rec:recruitment1){
            if (rec.getId()==recruitment.getId()){
                recruitmentService.updateRecruitment(recruitment);
                return "admin";
            }
        }
        return "wrong";
    }
}
