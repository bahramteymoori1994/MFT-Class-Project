package com.example.mftclassproject.lessonsession.service;

import com.example.mftclassproject.lessonsession.model.entity.LessonSession;

import java.util.List;

public interface LessonSessionService {
    void save(LessonSession lessonSession);
    void update(LessonSession lessonSession);
    void delete(long id);
    List<LessonSession> findAll();
    LessonSession findById(long id);
}
