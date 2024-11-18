package com.example.mftclassproject.lesson.service.impl;

import com.example.mftclassproject.lesson.model.entity.Lesson;
import com.example.mftclassproject.lesson.repository.LessonRepository;
import com.example.mftclassproject.lesson.service.LessonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    private final LessonRepository lessonRepository;

    public LessonServiceImpl(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public void save(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    @Override
    public void update(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    @Override
    public void delete(Long id) {
        lessonRepository.deleteById(id);
    }

    @Override
    public List<Lesson> findAll() {
        return lessonRepository.findAll();
    }

    @Override
    public Lesson findById(Long id) {
        return lessonRepository.findById(id).orElse(null);
    }
}
