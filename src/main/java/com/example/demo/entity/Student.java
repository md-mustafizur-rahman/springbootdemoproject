package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "first_name",nullable = false)
    String firstName;
    @Column(name = "last_name", nullable = false)
    String lastName;
}
