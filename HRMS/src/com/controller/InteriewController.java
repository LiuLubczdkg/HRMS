package com.controller;

import com.model.Guest;
import com.model.Interview;
import com.service.InterviewService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class InteriewController {
    @Resource
    private InterviewService interviewService;
    @RequestMapping(value = "/showInteriew")
    public String showInteriew(HttpServletRequest request,HttpSession session){
        Interview interview=new Interview();
        Guest guest= (Guest) session.getAttribute("guest");
        interview.setGuest(guest);
        Interview interview1=interviewService.selectInter(interview);
        if (null!=interview1){
            session.setAttribute("myinter",interview1);
        }else {

        }

        return "guest";
    }
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
