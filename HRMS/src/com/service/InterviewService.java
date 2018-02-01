package com.service;

import com.model.Interview;

public interface InterviewService {
    Interview selectInter(Interview interview);
    boolean addInter(Interview interview);
    boolean updateInter(Interview interview);
    boolean deleteInter(Interview interview);

}
