package com.school.junior.service;

import com.school.junior.model.Course;
import com.school.junior.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {


    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course addCourse(Course course) {
        if (course!=null){
            return courseRepository.save(course);
        }
        else return null;

    }

    public Course editCourse(Course editedCourse) throws Exception {
        Course originalCourse = courseRepository.getOne(editedCourse.getCourseId());

        if (originalCourse.getCourseId() == null) {
            originalCourse = editedCourse;
            courseRepository.save(originalCourse);
        } else {
            throw new Exception();
        }
        return originalCourse;

    }

    public Optional<Course> getCourseById(Long courseId) {
        return courseRepository.findById(courseId);
    }

    public void save(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
       return courseRepository.findAll();
    }
}
