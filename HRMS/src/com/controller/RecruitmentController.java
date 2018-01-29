package com.controller;

import com.model.Recruitment;
import com.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RecruitmentController {

    @Resource
    private RecruitmentService recruitmentService;
    @RequestMapping(value = "/addRecruitment")
    public String addRecruitment(Recruitment recruitment, HttpServletRequest request){
        Recruitment recruitment1=recruitmentService.selectRecruitByDJ(recruitment);
        if (null==recruitment1){
            recruitmentService.addRecruitment(recruitment);
            return "admin";
        }
        return "wrong";
    }
}
