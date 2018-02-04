package com.controller;

import com.model.*;
import com.mysql.fabric.xmlrpc.base.Data;
import com.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;

@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    @Resource
    private RecruitmentService recruitmentService;
    @Resource
    private GuestService guestService;
    @Resource
    private JobService jobService;
    @Resource
    private DepartmentService departmentService;
    @RequestMapping(value = "/addEmpl")
    public String addEmpl(Resume resume, Job job, Department department, @RequestParam(value = "basicwage")double basicwage, HttpServletRequest request, HttpSession session){
        Employee employee=new Employee();
        Guest g=guestService.selectGuestById(resume.getGuest());
        employee.setName(g.getName());
        employee.setPass(g.getPassword());
        employee.setRealname(resume.getName());
        employee.setAge(resume.getAge());
        employee.setEthnicity(resume.getEthnicity());
        employee.setPhone(resume.getPhone());
        employee.setMarrige(resume.getMarrige());
        employee.setAddress(resume.getAddress());
        Data data=new Data();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String hir =sdf.format(data);
        employee.setHiretime(hir);
        Department department1=departmentService.selectDepartment(department);
        employee.setDempartment(department1);
        Job job1=jobService.selectJob(job);
        employee.setJob(job1);
        employee.setBasicwage(basicwage);
        //未添加上下班时间
        employee.setWorkstatus(1);

        if (employeeService.addEmp(employee)){
            return "admin";
        }
        return "wrong";
    }
}
