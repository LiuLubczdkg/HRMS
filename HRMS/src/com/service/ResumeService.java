package com.service;

import com.model.Resume;

import java.util.List;

public interface ResumeService {
    List<Resume> AllResume();
    Resume MyResume(Resume resume);
    boolean addResume(Resume resume);
    boolean deleteResume(Resume resume);
    boolean updateResume(Resume resume);
}
