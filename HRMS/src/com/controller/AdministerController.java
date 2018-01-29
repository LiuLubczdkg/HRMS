package com.controller;

import com.model.Administer;
import com.service.AdministerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AdministerController {

    @Resource
    private AdministerService administerService;

    @RequestMapping(value="/adminlogin")
    public String Adminlogin(){return "adminlogin";}
    @RequestMapping(value = "login")
    public String Login(Administer administer, HttpServletRequest request, HttpServletResponse response)throws Exception{
        Administer administer1=administerService.selectAdmin(administer);
        if (administer1!=null){
            return "admin";
        }
       return "adminlogin";
    }



}
