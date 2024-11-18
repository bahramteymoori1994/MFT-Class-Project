package com.example.mftclassproject.teacher.model.entity;

import com.example.mftclassproject.person.entity.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "teacherEntity")
@Table(name = "teacher")
public class Teacher extends Person
{

}