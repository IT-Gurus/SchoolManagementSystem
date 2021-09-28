package com.school.junior.service;

import com.school.junior.model.Student;
import com.school.junior.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student findByStudentId(int studentId) {
      return   studentRepository.findByStudentId(studentId);
    }

    public Student save(Student student) {
     return    studentRepository.save(student);
    }
}
