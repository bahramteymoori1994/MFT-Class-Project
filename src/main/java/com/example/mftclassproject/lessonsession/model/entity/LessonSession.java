package com.example.mftclassproject.lessonsession.model.entity;

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

@Entity(name = "SessionEntity")
@Table(name = "lesson-session")
public class LessonSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
