package com.example.mftclassproject.mftclass.service.impl;

import com.example.mftclassproject.mftclass.model.entity.ClassType;
import com.example.mftclassproject.mftclass.model.entity.MFTClass;

import java.util.List;

public interface MFTClassService {
    void save(MFTClass mftClass);
    void update(MFTClass mftClass);
    void delete(Long id);
    List<MFTClass> findAll();
    MFTClass findById(Long id);
    List<MFTClass> findByLessonTitle(String lessonTitle);
    List<MFTClass> findByTeacherFamily(String teacherFamily);
    List<MFTClass> findByClassType(ClassType classType);
}
