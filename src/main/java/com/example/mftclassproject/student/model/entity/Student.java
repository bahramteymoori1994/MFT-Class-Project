package com.example.mftclassproject.student.model.entity;

import com.example.mftclassproject.person.entity.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "studentEntity")
@Table(name = "student")
public class Student extends Person
{

}