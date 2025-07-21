package com.tasktracker.project.controller;

import com.tasktracker.project.exception.ResourceNotFoundException;
import com.tasktracker.project.model.Project;
import com.tasktracker.project.service.ProjectService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping
    public List<Project> all() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Project one(@PathVariable Long id) {
        return service.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Project create(@RequestBody @Valid Project p) {
        return service.create(p);
    }

    @PutMapping("{id}")
    public Project update(@PathVariable Long id,
                          @RequestBody @Valid Project p) {
        return service.update(id, p);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
