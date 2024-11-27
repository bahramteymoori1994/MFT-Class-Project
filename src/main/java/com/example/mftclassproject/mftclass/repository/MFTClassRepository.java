package com.example.mftclassproject.mftclass.repository;

import com.example.mftclassproject.mftclass.model.entity.ClassType;
import com.example.mftclassproject.mftclass.model.entity.MFTClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MFTClassRepository extends JpaRepository<MFTClass, Long> {
    List<MFTClass> findByLessonTitleIsLike(String lessonTitle);
    List<MFTClass> findByTeacherFamilyIsLike(String teacherFamily);
    List<MFTClass> findByClassType(ClassType classType);
}
