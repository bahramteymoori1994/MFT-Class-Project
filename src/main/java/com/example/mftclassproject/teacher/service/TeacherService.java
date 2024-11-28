package com.example.mftclassproject.teacher.service;

import com.example.mftclassproject.teacher.model.entity.Teacher;

import java.util.List;

public interface TeacherService
{
    void save(Teacher teacher);
    void update(Teacher teacher);
    void delete(Long id);
    Teacher findByUsername(String username);
    boolean existsByUsername(String username);
    Teacher findById(Long id);
    List<Teacher> findAll();
    Teacher findByUsernameAndPassword(String username, String password);
}