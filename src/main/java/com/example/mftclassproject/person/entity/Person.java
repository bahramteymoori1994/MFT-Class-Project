package com.example.mftclassproject.person.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.processing.Pattern;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString
@AllArgsConstructor

@MappedSuperclass
public abstract class Person
{
    @Column(name="name", length = 30, nullable = false)
//    @Pattern(regexp = "^[a-zA-Z\\s]{3,30}$" ,message = "Invalid Name")
    private String name;

    @Column(name="family", length = 30, nullable = false)
    //@Pattern(regexp = "^[a-zA-Z\\s]{3,30}$" ,message = "Invalid Family")
    private String family;

    @Column(name = "username", length = 30)
    //@Pattern(regexp = "^[a-zA-Z\\d\\S\\._]{3,30}$" ,message = "Invalid username")
    private String username;

    @Column(name = "password", length = 15, nullable = false)
    //  @Pattern(regexp = "^[\\w\\S]{3,30}$" ,message = "Invalid Password")
    private String password;

    @Column(name="email", length = 50)
//    @Pattern(regexp = "^\\w{3,35}@(gmail|yahoo|microsoft)\\.com$" ,message = "Invalid Email")
    private String email;

    @Column(name="phone_number", length = 15, unique = true)
//    @Pattern(regexp = "^(09|\\+989)\\d{9}$" ,message = "Invalid PhoneNumber")
    private String phoneNumber;

    @Column(name = "national_code", length = 10)
    //@Pattern(regexp = "^//d{10}$")
    private String nationalCode;

    @Column(name = "address", length = 150)
    //@Pattern(regexp = "^//d{10}$")
    private String address;

}