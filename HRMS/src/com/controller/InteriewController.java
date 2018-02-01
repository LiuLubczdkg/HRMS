package com.controller;

import com.service.InterviewService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class InteriewController {
    @Resource
    private InterviewService interviewService;

}
