package com.example.springassignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping("/foundation")
    public List<String> getFoundationCourses() {
        return Arrays.asList(
                "Introduction to Programming",
                "Computer Literacy"
        );
    }

    @GetMapping("/undergraduate")
    public List<String> getUndergraduateCourses() {
        return Arrays.asList(
                "Object-Oriented Programming",
                "Data Structures and Algorithms",
                "Database Systems",
                "Computer Networks",
                "Software Engineering"
        );
    }

    @GetMapping("/honours")
    public List<String> getHonoursCourses() {
        return Arrays.asList(
                "Advanced Algorithms",
                "Machine Learning",
                "Distributed Systems",
                "Research Methodology"
        );
    }
}