package com.controller;

import com.model.Department;
import com.model.Resume;
import com.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;
    @RequestMapping(value = "/addDepartment")
    public String addDepartment(Department department, HttpServletRequest request){
      Department department1=departmentService.selectDepartment(department);

       if (null == department1) {
           departmentService.addDepartment(department);
           return "admin";
       }
        return "wrong";
    }
    @RequestMapping(value = "/delDepartment")
    public String delDepartment(Department department, HttpServletRequest request){
        Department department1=departmentService.selectDepartment(department);
        if (null!=department1){
           departmentService.deleteDepartment(department);
            return "admin";
        }
        return "wrong";
    }
    @RequestMapping(value = "/updateDepartment")
    public String updateDepartment(Department department, HttpServletRequest request){
        Department department1=departmentService.selectDepartment(department);
        if (null!=department1){
            departmentService.updateDepartment(department);
            return "admin";
        }
        return "wrong";
    }
}
