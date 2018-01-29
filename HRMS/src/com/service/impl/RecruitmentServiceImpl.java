package com.service.impl;

import com.dao.RecruitmentMapper;
import com.model.Recruitment;
import com.service.RecruitmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("recruitment")
public class RecruitmentServiceImpl implements RecruitmentService{
    @Resource
    private RecruitmentMapper recruitmentMapper;

    public RecruitmentServiceImpl() {
    }

    @Override
    public List<Recruitment> AllRecruitment() {
        return recruitmentMapper.AllRecruitment();
    }

    @Override
    public Recruitment selectRecruitByDJ(Recruitment recruitment) {
        return recruitmentMapper.selectRecruitByDJ(recruitment);
    }

    @Override
    public boolean addRecruitment(Recruitment recruitment) {
        return recruitmentMapper.addRecruitment(recruitment);
    }

    @Override
    public boolean deleteRecruitment(Recruitment recruitment) {
        return recruitmentMapper.deleteRecruitment(recruitment);
    }

    @Override
    public boolean updateRecruitment(Recruitment recruitment) {
        return recruitmentMapper.updateRecruitment(recruitment);
    }
}
