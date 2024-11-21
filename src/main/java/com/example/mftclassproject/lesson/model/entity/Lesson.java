package com.example.mftclassproject.lesson.model.entity;

import com.example.mftclassproject.mftclass.model.entity.MFTClass;
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

@Entity(name = "lessonEntity")
@Table(name = "lesson")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @OneToMany(fetch = FetchType.EAGER)
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "lesson")
    private List<MFTClass> mftClasses;
}
