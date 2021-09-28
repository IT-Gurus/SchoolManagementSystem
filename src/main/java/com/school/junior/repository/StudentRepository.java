package com.school.junior.repository;

import com.school.junior.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer> {
    Student findByStudentId(Integer studentId);
}
