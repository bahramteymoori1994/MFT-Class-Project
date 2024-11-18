package com.example.mftclassproject.classactivity.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity(name = "classActivityEntity")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "class-activity")
public class ClassActivity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}