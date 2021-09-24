package com.school.junior.api;

import com.school.junior.model.Course;
import com.school.junior.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1")
public class CourseController {
   final private CourseService courseService;
@Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/addcourse")
    public Course addCourse(@RequestBody Course course){
      return   courseService.addCourse(course);

    }
}
