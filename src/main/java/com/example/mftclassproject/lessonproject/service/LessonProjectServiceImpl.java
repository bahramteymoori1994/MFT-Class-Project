package com.example.mftclassproject.lessonproject.service;

import com.example.mftclassproject.lessonproject.model.entity.LessonProject;
import com.example.mftclassproject.lessonproject.repository.LessonProjectRepository;
import com.example.mftclassproject.lessonproject.service.impl.LessonProjectService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LessonProjectServiceImpl implements LessonProjectService {
    private final LessonProjectRepository projectRepository;

    public LessonProjectServiceImpl(LessonProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void save(LessonProject project) {
        projectRepository.save(project);
    }

    @Override
    public void update(LessonProject project) {
        projectRepository.save(project);
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public List<LessonProject> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public LessonProject findById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }
}
