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

    @Override
    public List<Project> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Project> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Project create(Project project) {
        if (project.getName() == null || project.getName().isBlank()) {
            throw new IllegalArgumentException("Project name cannot be blank");
        }
        return repo.save(project);
    }

    @Override
    public Project update(Long id, Project project) {
        return repo.findById(id)
                .map(existing -> {
                    existing.setName(project.getName());
                    existing.setDescription(project.getDescription());
                    existing.setDueDate(project.getDueDate());
                    return repo.save(existing);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Project not found: " + id));
    }

    @Override
    public void delete(Long id) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException("Project not found: " + id);
        }
        repo.deleteById(id);
    }
}
