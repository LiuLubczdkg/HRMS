package com.controller;

import com.model.Job;
import com.model.Resume;
import com.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class JobContriller {
    @Resource
    private JobService jobService;
    @RequestMapping(value = "/addJob")
    public String addJob(Job job, HttpServletRequest request){
        Job job1=jobService.selectJob(job);
        if (null==job1){
            jobService.addjob(job);
            return "admin";
        }
        return "wrong";
    }
    @RequestMapping(value = "/delJob")
    public String delJob(Job job, HttpServletRequest request){
        Job job1=jobService.selectJob(job);
        if (null!=job1){
            jobService.deletejob(job);
            return "admin";
        }
        return "wrong";
    }
    @RequestMapping(value = "/updateJob")
    public String updateJob(Job job, HttpServletRequest request){
        Job job1=jobService.selectJob(job);
        if (null!=job1){
            jobService.updatejob(job);
            return "admin";
        }
        return "wrong";
    }
}
