package com.tasktracker.task.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProjectRef {

    @Id
    private Long id;

    private String name;
}
