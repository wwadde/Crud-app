package com.CRUD.App.Model;

import com.googlecode.jmapper.annotations.JMap;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

import java.time.LocalDate;


@Entity(name = "USERS")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JMap
    private Long id;
    @JMap
    private String name;
    private Integer age;
    private String gender;
    private String email;
    private LocalDate date;

}
