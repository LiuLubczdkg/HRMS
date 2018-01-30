package com.dao;

import com.model.Job;

import java.util.List;

public interface JobMapper {
    List<Job> Alljob();
    boolean addjob(Job job);
    boolean updatejob(Job job);
    boolean deletejob(Job job);
}
