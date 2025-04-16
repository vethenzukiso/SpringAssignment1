package com.example.demo.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Course {

    @NotNull(message = "Course ID is required")
    private Integer id;

    @NotNull(message = "Course name is required")
    @Size(min = 3, max = 50, message = "Course name must be between 3 and 50 characters")
    private String name;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}