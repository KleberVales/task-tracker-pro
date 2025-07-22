package com.tasktracker.task.service;

import com.tasktracker.task.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> findAll();
    List<Task> findByProject(Long projectId);
    Optional<Task> findById(Long id);
    Task create(Task task);
    Task update(Long id, Task task);
    void delete(Long id);
}
