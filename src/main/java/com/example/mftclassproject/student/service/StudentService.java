package com.example.mftclassproject.student.service;

import com.example.mftclassproject.student.model.entity.Student;

import java.util.List;

public interface StudentService
{
    Student save(Student student);
    Student update(Student student);
    void deleteById(Long id);
    Student findById(Long id);
    List<Student> findAll();
}