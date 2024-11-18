package com.example.mftclassproject.mftclass.repository;

import com.example.mftclassproject.mftclass.model.entity.MFTClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MFTClassRepository extends JpaRepository<MFTClass, Long> {
}
