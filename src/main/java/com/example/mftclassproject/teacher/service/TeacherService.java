package com.example.mftclassproject.teacher.service;

import com.example.mftclassproject.teacher.model.entity.Teacher;

import java.util.List;

public interface TeacherService
{
    Teacher save(Teacher teacher);
    Teacher update(Teacher teacher);
    void deleteById(Long id);
    Teacher findById(Long id);
    List<Teacher> findAll();
}