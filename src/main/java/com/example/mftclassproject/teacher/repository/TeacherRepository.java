package com.example.mftclassproject.teacher.repository;

import com.example.mftclassproject.teacher.model.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    boolean existsTeacherByUsername(String username);
    Teacher findByUsername(String username);
    Optional<Teacher> findByUsernameAndPassword(String username, String password);
}
