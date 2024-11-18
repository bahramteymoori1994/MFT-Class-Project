package com.example.mftclassproject.teacher.service.impl;

import com.example.mftclassproject.teacher.model.entity.Teacher;
import com.example.mftclassproject.teacher.repository.TeacherRepository;
import com.example.mftclassproject.teacher.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService
{
    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher save(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher update(Teacher teacher) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Teacher findById(Long id) {
        return null;
    }

    @Override
    public List<Teacher> findAll() {
        return List.of();
    }
}