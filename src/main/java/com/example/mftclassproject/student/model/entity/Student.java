package com.example.mftclassproject.student.model.entity;

import com.example.mftclassproject.mftclass.model.entity.MFTClass;
import com.example.mftclassproject.person.entity.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name = "studentEntity")
@Table(name = "student_tbl")

public class Student extends Person {
    @Id
    @SequenceGenerator(name = "studentSeq", sequenceName = "student_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentSeq")
    @Column(name = "id")
    private Long id;

    @ManyToMany
    private List<MFTClass> mftClasses;
}