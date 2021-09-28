package com.school.junior.api;

import com.school.junior.model.Course;
import com.school.junior.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@CrossOrigin(value = "http://localhost:8080/")
@RequestMapping("/api/v1/courses/")
public class CourseController {

    final private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/addcourse")
    public Course addCourse(@RequestBody Course course) {
        courseService.save(course);
        return courseService.addCourse(course);

    }

    @GetMapping(value = "/{courseId}")
    public Optional<Course> getCourseById(@PathVariable Long courseId) {
        return courseService.getCourseById(courseId);
    }

    @GetMapping(value = "/allcourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
