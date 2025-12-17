package com.example.demo.entity

import jakarta.persistence.*;

@Entity
public class StudentEntity{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
}
