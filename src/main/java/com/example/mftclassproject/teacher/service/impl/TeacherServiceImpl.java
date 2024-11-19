package com.example.mftclassproject.teacher.service.impl;

import com.example.mftclassproject.teacher.model.entity.Teacher;
import com.example.mftclassproject.teacher.repository.TeacherRepository;
import com.example.mftclassproject.teacher.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void save(Teacher teacher) {
        if(! teacherRepository.existsTeacherByUsername(teacher.getUsername())) {
            teacherRepository.save(teacher);
        }
    }

    @Override
    public void update(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteById(Long id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public Teacher findByUsername(String username) {
        return teacherRepository.findByUsername(username);
    }

    @Override
    public boolean existsByUsername(String username) {
        return teacherRepository.existsTeacherByUsername(username);
    }

    @Override
    public Teacher findById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findByUsernameAndPassword(String username, String password) {
        return null;
    }
}