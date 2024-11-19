package com.example.mftclassproject.student.repository;

import com.example.mftclassproject.student.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsStudentByUsername(String username);
    Student findByUsername(String username);
    Optional<Student> findByUsernameAndPassword(String username, String password);
}
