package com.controller;

import com.model.Interview;
import com.service.InterviewService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class InteriewController {
    @Resource
    private InterviewService interviewService;
    @RequestMapping(value = "/addInteriew")
    public String addInteriew(Interview interview, HttpServletRequest request){
        Interview interview1=interviewService.selectInter(interview);
        if (null!=interview){
            interviewService.addInter(interview);
            return "admin";
        }
        return "wrong";
    }
    @RequestMapping(value = "/updateInteriew")
    public String updateInteriew(Interview interview, HttpServletRequest request){
        Interview interview1=interviewService.selectInter(interview);
        if (null!=interview){
            interviewService.updateInter(interview);
            return "admin";
        }
        return "wrong";
    }
    @RequestMapping(value = "/delInteriew")
    public String delInteriew(Interview interview, HttpServletRequest request){
        Interview interview1=interviewService.selectInter(interview);
        if (null!=interview){
            interviewService.deleteInter(interview);
            return "admin";
        }
        return "wrong";
    }

}
