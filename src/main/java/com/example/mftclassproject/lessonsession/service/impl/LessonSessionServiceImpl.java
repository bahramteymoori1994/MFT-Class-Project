package com.example.mftclassproject.lessonsession.service.impl;
import com.example.mftclassproject.lessonsession.model.entity.LessonSession;
import com.example.mftclassproject.lessonsession.repository.LessonSessionRepository;
import com.example.mftclassproject.lessonsession.service.LessonSessionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonSessionServiceImpl implements LessonSessionService {

    private final LessonSessionRepository lessonSessionRepository;

    public LessonSessionServiceImpl(LessonSessionRepository lessonSessionRepository) {
        this.lessonSessionRepository = lessonSessionRepository;
    }

    @Override
    public void save(LessonSession lessonSession) {
        lessonSessionRepository.save(lessonSession);
    }

    @Override
    public void update(LessonSession lessonSession) {
        lessonSessionRepository.save(lessonSession);
    }

    @Override
    public void delete(long id) {
        lessonSessionRepository.deleteById(id);
    }

    @Override
    public List<LessonSession> findAll() {
        return lessonSessionRepository.findAll();
    }

    @Override
    public LessonSession findById(long id) {
        return lessonSessionRepository.findById(id).orElse(null);
    }
}
