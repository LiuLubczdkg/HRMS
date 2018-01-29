package com.service;

import com.model.Recruitment;

import java.util.List;

public interface RecruitmentService {
    List<Recruitment> AllRecruitment();
    Recruitment selectRecruitByDJ(Recruitment recruitment);
    boolean addRecruitment(Recruitment recruitment);
    boolean deleteRecruitment(Recruitment recruitment);
    boolean updateRecruitment(Recruitment recruitment);
}
