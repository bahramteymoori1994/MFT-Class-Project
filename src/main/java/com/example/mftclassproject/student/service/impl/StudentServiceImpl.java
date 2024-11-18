package com.example.mftclassproject.student.service.impl;

import com.example.mftclassproject.student.model.entity.Student;
import com.example.mftclassproject.student.repository.StudentRepository;
import com.example.mftclassproject.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }
}