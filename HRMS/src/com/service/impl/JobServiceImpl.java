package com.service.impl;

import com.dao.JobMapper;
import com.model.Job;
import com.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("JobService")
public class JobServiceImpl implements JobService {
    @Resource
    private JobMapper jobMapper;

    public JobServiceImpl() {
    }

    @Override
    public List<Job> Alljob() {
        return jobMapper.Alljob();
    }

    @Override
    public Job selectJob(Job job) {
        return jobMapper.selectJob(job);
    }

    @Override
    public boolean addjob(Job job) {
        return jobMapper.addjob(job);
    }

    @Override
    public boolean updatejob(Job job) {
        return jobMapper.updatejob(job);
    }

    @Override
    public boolean deletejob(Job job) {
        return jobMapper.deletejob(job);
    }
}
