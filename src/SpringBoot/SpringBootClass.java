package SpringBoot;

public class SpringBootClass {
}
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/computer-science")
public class CourseController {

    @GetMapping("/courses")
    public Map<String, Object> getCourses() {
        Map<String, Object> courses = new HashMap<>();
        courses.put("Foundation Courses", "2 courses offered");
        courses.put("Undergraduate Courses", "5 courses offered");
        courses.put("Honours Courses", "4 courses offered");
        return courses;
    }
}

