package com.example.mftclassproject.mftclass.service.impl;

import com.example.mftclassproject.mftclass.model.enums.ClassType;
import com.example.mftclassproject.mftclass.model.entity.MFTClass;
import com.example.mftclassproject.mftclass.repository.MFTClassRepository;
import com.example.mftclassproject.mftclass.service.MFTClassService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MFTClassServiceImpl implements MFTClassService {
    private final MFTClassRepository mftClassRepository;

    public MFTClassServiceImpl(MFTClassRepository mftClassRepository) {
        this.mftClassRepository = mftClassRepository;
    }

    @Override
    public void save(MFTClass mftClass) {
        mftClassRepository.save(mftClass);
    }

    @Override
    public void update(MFTClass mftClass) {
        mftClassRepository.save(mftClass);
    }

    @Override
    public void delete(Long id) {
        mftClassRepository.deleteById(id);
    }

    @Override
    public List<MFTClass> findAll() {
        return mftClassRepository.findAll();
    }

    @Override
    public MFTClass findById(Long id) {
        return mftClassRepository.findById(id).orElse(null);
    }

    @Override
    public List<MFTClass> findByLessonTitle(String lessonTitle) {
        return mftClassRepository.findByLessonTitleIsLike(lessonTitle.toUpperCase() + "%");
    }

    @Override
    public List<MFTClass> findByTeacherFamily(String teacherFamily) {
        return mftClassRepository.findByTeacherFamilyIsLike(teacherFamily.toUpperCase() + "%");
    }

    @Override
    public List<MFTClass> findByClassType(ClassType classType) {
        return mftClassRepository.findByClassType(classType);
    }

    @Override
    public List<MFTClass> findByLocation(String location) {
        return mftClassRepository.findByLocation(location);
    }
}
