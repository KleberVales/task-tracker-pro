package com.tasktracker.project.service;

import com.tasktracker.project.exception.ResourceNotFoundException;
import com.tasktracker.project.model.Project;
import com.tasktracker.project.repository.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository repo;

    public ProjectServiceImpl(ProjectRepository repo) {
        this.repo = repo;
    }

    // ... métodos existentes (create, update, delete)
}
