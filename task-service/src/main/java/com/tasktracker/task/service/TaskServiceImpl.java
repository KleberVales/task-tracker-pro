package com.tasktracker.task.service;

import com.tasktracker.task.model.Task;
import com.tasktracker.task.repository.TaskRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository repo;

    public TaskServiceImpl(TaskRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Task> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Task> findByProject(Long projectId) {
        return repo.findByProjectId(projectId);
    }

    @Override
    public Optional<Task> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Task create(@Valid Task task) {
        return repo.save(task);
    }

    @Override
    public Task update(Long id, @Valid Task task) {
        return repo.findById(id)
                .map(existing -> {
                    existing.setTitle(task.getTitle());
                    existing.setDescription(task.getDescription());
                    existing.setDueDate(task.getDueDate());
                    existing.setCompleted(task.isCompleted());
                    return repo.save(existing);
                }).orElseThrow(() -> new IllegalArgumentException("Task not found: " + id));
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
