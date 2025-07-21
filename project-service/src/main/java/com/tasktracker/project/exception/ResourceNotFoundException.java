package com.tasktracker.project.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Long id) {
        super("Resource not found with ID: " + id);
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
