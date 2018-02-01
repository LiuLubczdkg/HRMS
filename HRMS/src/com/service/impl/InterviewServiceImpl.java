package com.service.impl;

import com.dao.InterviewMapper;
import com.model.Interview;
import com.service.InterviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("InterviewService")
public class InterviewServiceImpl implements InterviewService {
    @Resource
    private InterviewMapper interviewMapper;

    public InterviewServiceImpl() {
    }

    @Override
    public Interview selectInter(Interview interview) {
        return interviewMapper.selectInter(interview);
    }

    @Override
    public boolean addInter(Interview interview) {
        return interviewMapper.addInter(interview);
    }

    @Override
    public boolean updateInter(Interview interview) {
        return interviewMapper.updateInter(interview);
    }

    @Override
    public boolean deleteInter(Interview interview) {
        return interviewMapper.deleteInter(interview);
    }
}
