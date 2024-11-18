package com.example.mftclassproject.lessonproject.repository;

import com.example.mftclassproject.lessonproject.model.entity.LessonProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonProjectRepository extends JpaRepository<LessonProject, Long> {
}
