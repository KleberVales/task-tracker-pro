package com.tasktracker.project.model;

import jakarta.persistence.*;    // traz @Entity, @Id, @GeneratedValue, @GenerationType

import java.time.LocalDate;

@Entity
public class Project {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private LocalDate dueDate;
    // getters/setters ou @Data do Lombok
}
