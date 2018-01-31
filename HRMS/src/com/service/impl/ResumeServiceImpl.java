package com.service.impl;

import com.dao.ResumeMapper;
import com.model.Resume;
import com.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ResumeService")
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeMapper resumeMapper;

    public ResumeServiceImpl() {
    }

    @Override
    public List<Resume> AllResume() {
        return resumeMapper.AllResume();
    }

    @Override
    public Resume MyResume(Resume resume) {
        return resumeMapper.MyResume(resume);
    }

    @Override
    public boolean addResume(Resume resume) {
        return resumeMapper.addResume(resume);
    }

    @Override
    public boolean deleteResume(Resume resume) {
        return resumeMapper.deleteResume(resume);
    }

    @Override
    public boolean updateResume(Resume resume) {
        return resumeMapper.updateResume(resume);
    }
}
