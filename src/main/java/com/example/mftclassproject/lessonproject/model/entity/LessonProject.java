package com.example.mftclassproject.lessonproject.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name = "projectEntity")
@Table(name = "project")
public class LessonProject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
