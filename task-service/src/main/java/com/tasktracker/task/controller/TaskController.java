package com.tasktracker.task.controller;

import com.tasktracker.task.model.Task;
import com.tasktracker.task.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> all() {
        return service.findAll();
    }

    @GetMapping("/project/{id}")
    public List<Task> byProject(@PathVariable Long id) {
        return service.findByProject(id);
    }

    @GetMapping("/{id}")
    public Task one(@PathVariable Long id) {
        return service.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Task not found"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task create(@RequestBody @Valid Task task) {
        return service.create(task);
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id,
                       @RequestBody @Valid Task task) {
        return service.update(id, task);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
