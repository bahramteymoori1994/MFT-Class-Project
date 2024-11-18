package com.example.mftclassproject.person.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}