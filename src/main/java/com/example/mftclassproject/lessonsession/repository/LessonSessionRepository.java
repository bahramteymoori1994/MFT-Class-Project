package com.example.mftclassproject.lessonsession.repository;

import com.example.mftclassproject.lessonsession.model.entity.LessonSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonSessionRepository extends JpaRepository<LessonSession, Long> {
}
