package com.service;

import com.model.Job;

import java.util.List;

public interface JobService {
    List<Job> Alljob();
    Job selectJob(Job job);
    boolean addjob(Job job);
    boolean updatejob(Job job);
    boolean deletejob(Job job);
}
