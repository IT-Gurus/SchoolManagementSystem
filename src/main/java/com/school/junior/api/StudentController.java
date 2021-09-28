package com.school.junior.api;

import com.school.junior.model.Student;
import com.school.junior.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{studentId}")
    public Student findStudentById(@PathVariable Integer studentId){
        return studentService.findByStudentId(studentId);

    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return studentService.save(student);

    }


}
