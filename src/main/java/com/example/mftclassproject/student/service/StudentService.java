package com.example.mftclassproject.student.service;

import com.example.mftclassproject.student.model.entity.Student;

import java.util.List;

public interface StudentService
{
    void save(Student student);
    void update(Student student);
    void delete(Long id);
    Student findByUsername(String username);
    boolean existsByUsername(String username);
    Student findById(Long id);
    List<Student> findAll();
    Student findByUsernameAndPassword(String username, String password);

}