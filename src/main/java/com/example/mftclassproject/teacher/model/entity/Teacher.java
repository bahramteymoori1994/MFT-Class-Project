package com.example.mftclassproject.teacher.model.entity;

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

@Entity(name = "teacherEntity")
@Table(name = "teacher")

public class Teacher extends Person {
    @Id
    @SequenceGenerator(name = "teacherSeq", sequenceName = "teacher_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacherSeq")
    @Column(name = "id")
    private Long id;

    @OneToMany(fetch = FetchType.EAGER)
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher")
    private List<MFTClass> mftClasses;
}