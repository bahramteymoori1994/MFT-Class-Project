package com.example.mftclassproject.lesson.repository;

import com.example.mftclassproject.lesson.model.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
