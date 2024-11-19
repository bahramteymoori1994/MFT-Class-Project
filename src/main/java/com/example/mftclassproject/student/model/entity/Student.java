package com.example.mftclassproject.student.model.entity;

import com.example.mftclassproject.mftclass.model.entity.MFTClass;
import com.example.mftclassproject.person.entity.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity(name = "studentEntity")
@Table(name = "student")
public class Student extends Person
{

    @ManyToMany
    private List<MFTClass> mftClasses;
}