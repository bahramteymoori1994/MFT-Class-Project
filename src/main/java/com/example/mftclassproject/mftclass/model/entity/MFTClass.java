package com.example.mftclassproject.mftclass.model.entity;

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

@Entity(name = "mftClassEntity")
@Table(name = "mft-class")
public class MFTClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
