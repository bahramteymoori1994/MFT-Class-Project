package com.example.mftclassproject.teacher.model.entity;

import com.example.mftclassproject.mftclass.model.entity.MFTClass;
import com.example.mftclassproject.person.entity.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity(name = "teacherEntity")
@Table(name = "teacher")
public class Teacher extends Person
{

    @OneToMany(fetch = FetchType.EAGER)
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher")
    private List<MFTClass> mftClasses;

}