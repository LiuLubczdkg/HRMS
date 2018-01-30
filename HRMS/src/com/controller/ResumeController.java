package com.controller;

import com.model.Recruitment;
import com.model.Resume;
import com.service.RecruitmentService;
import com.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping(value = "/addResume")
    public String addResume(Resume resume, HttpServletRequest request){
        Resume resume1=resumeService.MyResume(resume);
        if (null==resume1){
            resumeService.addResume(resume);
            return "guest";
        }
        return "wrong";
    }
    @RequestMapping(value = "/delResume")
    public String delResume(Resume resume, HttpServletRequest request){
        Resume resume1=resumeService.MyResume(resume);
        if (null==resume1){
            resumeService.deleteResume(resume);
            return "guest";
        }
        return "wrong";
    }
    @RequestMapping(value = "/updateResume")
    public String updateResume(Resume resume, HttpServletRequest request){
        Resume resume1=resumeService.MyResume(resume);
        if (null==resume1){
            resumeService.updateResume(resume);
            return "guest";
        }
        return "wrong";
    }
}
