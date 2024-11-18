package com.example.mftclassproject.classactivity.service.impl;

import com.example.mftclassproject.classactivity.model.entity.ClassActivity;
import com.example.mftclassproject.classactivity.repository.ClassActivityRepository;
import com.example.mftclassproject.classactivity.service.ClassActivityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassActivityServiceImpl implements ClassActivityService
{
    private final ClassActivityRepository classActivityRepository;

    public ClassActivityServiceImpl(ClassActivityRepository classActivityRepository) {
        this.classActivityRepository = classActivityRepository;
    }

    @Override
    public ClassActivity save(ClassActivity classActivity) {
        return null;
    }

    @Override
    public ClassActivity update(ClassActivity classActivity) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public ClassActivity findById(Long id) {
        return null;
    }

    @Override
    public List<ClassActivity> findAll() {
        return List.of();
    }
}