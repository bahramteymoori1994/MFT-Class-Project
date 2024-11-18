package com.example.mftclassproject.lessonproject.service.impl;

import com.example.mftclassproject.lessonproject.model.entity.LessonProject;

import java.util.List;

public interface LessonProjectService {
    void save(LessonProject project);
    void update(LessonProject project);
    void delete(Long id);
    List<LessonProject> findAll();
    LessonProject findById(Long id);
}
