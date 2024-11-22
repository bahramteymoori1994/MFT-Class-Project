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
    public void  save(ClassActivity classActivity) {classActivityRepository.save(classActivity);}

    @Override
    public void  update(ClassActivity classActivity) {
        classActivityRepository.save(classActivity);
    }

    @Override
    public void deleteById(Long id) {classActivityRepository.deleteById(id);}

    @Override
    public ClassActivity findById(Long id) {return
        classActivityRepository.findById(id).orElse(null);}

    @Override
    public List<ClassActivity> findAll() {
        return classActivityRepository.findAll();
    }
}