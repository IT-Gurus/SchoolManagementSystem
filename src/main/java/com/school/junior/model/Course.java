package com.school.junior.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long courseId;
    private String courseType;
    private String courseName;
    private String courseDescritpion;
    private Date courseYear;
    private int courseStudentId;

    /*
    * addCourse()
    * editCourse()
    * deleteCourse()
    * searchCourse()
    *
    * */

}
