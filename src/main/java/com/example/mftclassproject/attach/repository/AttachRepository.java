package com.example.mftclassproject.attach.repository;

import com.example.mftclassproject.attach.model.entity.Attach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachRepository extends JpaRepository<Attach, Long> {


}
