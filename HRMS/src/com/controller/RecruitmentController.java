package com.controller;

import com.model.Recruitment;
import com.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class RecruitmentController {

    @Resource
    private RecruitmentService recruitmentService;
    @RequestMapping(value="/addre")
    public String addre(){return "addre";}
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
