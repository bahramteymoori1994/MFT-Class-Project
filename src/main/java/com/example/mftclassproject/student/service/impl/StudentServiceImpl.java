package com.example.mftclassproject.student.service.impl;

import com.example.mftclassproject.student.model.entity.Student;
import com.example.mftclassproject.student.repository.StudentRepository;
import com.example.mftclassproject.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void save(Student student) {
        if(! studentRepository.existsStudentByUsername(student.getUsername())) {
            studentRepository.save(student);
        }
    }

    @Override
    public void update(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findByUsername(String username) {
        return studentRepository.findByUsername(username);
    }

    @Override
    public boolean existsByUsername(String username) {
        return studentRepository.existsStudentByUsername(username);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByUsernameAndPassword(String username, String password) {
        return null;
    }
}