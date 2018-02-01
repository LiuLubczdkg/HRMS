package com.dao;

import com.model.Interview;

public interface InterviewMapper {
    Interview selectInter(Interview interview);
    boolean addInter(Interview interview);
    boolean updateInter(Interview interview);
    boolean deleteInter(Interview interview);
}
