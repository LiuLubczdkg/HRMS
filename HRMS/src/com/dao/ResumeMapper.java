package com.dao;

import com.model.Resume;

import java.util.List;

public interface ResumeMapper {
    List<Resume> AllResume();
    Resume MyResume(Resume resume);
    boolean addResume(Resume resume);
    boolean deleteResume(Resume resume);
    boolean updateResume(Resume resume);
}
