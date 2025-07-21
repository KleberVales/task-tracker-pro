package com.tasktracker.project.service;

import com.tasktracker.project.model.Project;
import java.util.List;
import java.util.Optional;

public interface ProjectService {
    List<Project> findAll();
    Optional<Project> findById(Long id);
    Project create(Project project);
    Project update(Long id, Project project);
    void delete(Long id);
}
