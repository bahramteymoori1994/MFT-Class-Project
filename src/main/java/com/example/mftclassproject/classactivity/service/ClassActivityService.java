package com.example.mftclassproject.classactivity.service;

import com.example.mftclassproject.classactivity.model.entity.ClassActivity;

import java.util.List;

public interface ClassActivityService
{
    ClassActivity save(ClassActivity classActivity);
    ClassActivity update(ClassActivity classActivity);
    void deleteById(Long id);
    ClassActivity findById(Long id);
    List<ClassActivity> findAll();
}