package com.example.mftclassproject.attach.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity(name = "attachEntity")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "attach")
public class Attach
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}