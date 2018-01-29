package com.dao;

import com.model.Recruitment;

import java.util.List;

public interface RecruitmentMapper {
    List<Recruitment> AllRecruitment();
    Recruitment selectRecruitByDJ(Recruitment recruitment);
    boolean addRecruitment(Recruitment recruitment);
    boolean deleteRecruitment(Recruitment recruitment);
    boolean updateRecruitment(Recruitment recruitment);
}
