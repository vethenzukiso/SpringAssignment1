package com.example.demo.controller;

import com.example.demo.model.Course;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private Map<Integer, Course> courses = new HashMap<>();

    @PostMapping
    public ResponseEntity<String> createCourse(@Valid @RequestBody Course course) {
        if (courses.containsKey(course.getId())) {
            return new ResponseEntity<>("Course with this ID already exists", HttpStatus.CONFLICT);
        }
        courses.put(course.getId(), course);
        return new ResponseEntity<>("Course created successfully", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllCourses() {
        return new ResponseEntity<>(courses.values(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCourse(@PathVariable Integer id) {
        Course course = courses.get(id);
        if (course == null) {
            return new ResponseEntity<>("Course not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCourse(@PathVariable Integer id, @Valid @RequestBody Course updatedCourse) {
        if (!courses.containsKey(id)) {
            return new ResponseEntity<>("Course not found", HttpStatus.NOT_FOUND);
        }
        updatedCourse.setId(id);
        courses.put(id, updatedCourse);
        return new ResponseEntity<>("Course updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable Integer id) {
        if (!courses.containsKey(id)) {
            return new ResponseEntity<>("Course not found", HttpStatus.NOT_FOUND);
        }
        courses.remove(id);
        return new ResponseEntity<>("Course deleted successfully", HttpStatus.OK);
    }
}