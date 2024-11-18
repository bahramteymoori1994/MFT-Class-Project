package com.example.mftclassproject.lesson.service;

import com.example.mftclassproject.lesson.model.entity.Lesson;

import java.util.List;

public interface LessonService {
    void save(Lesson lesson);
    void update(Lesson lesson);
    void delete(Long id);
    List<Lesson> findAll();
    Lesson findById(Long id);
}
