package com.school.junior.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Required;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;

@Data
@Entity
public class Student {
    @Id
    private Integer studentId;
    private String studentName;
    private String studentMobile;
    private String studentEmail;
    private String studentAddress;
    private String studentPassword;
    private String username;
    private  int studentColledgeId;

    public Student() {
    }

    public Student(Integer studentId, String studentName, String studentMobile, String studentEmail, String studentAddress, String studentPassword, String username, int studentColledgeId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMobile = studentMobile;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentPassword = studentPassword;
        this.username = username;
        this.studentColledgeId = studentColledgeId;
    }






}
