package com.controller;

import com.model.Employee;
import com.model.Guest;
import com.model.Resume;
import com.service.EmployeeService;
import com.service.GuestService;
import com.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    @Resource
    private RecruitmentService recruitmentService;
    @Resource
    private GuestService guestService;
    @RequestMapping(value = "/addEmpl")
    public String addEmpl(Resume resume, HttpServletRequest request,HttpSession session){
        Guest g=guestService.selectGuestById(resume.getGuest());


        Guest guest =(resume.getGuest());
        if (null!=guest){

            return "guest";
        }
        return "wrong";
    }
}
