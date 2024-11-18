package com.example.mftclassproject.classactivity.repository;

import com.example.mftclassproject.classactivity.model.entity.ClassActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassActivityRepository extends JpaRepository<ClassActivity, Long> {
}
