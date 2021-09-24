package com.school.junior.model;

import lombok.Data;

@Data
public class Student {
    private int studentId;
    private String studentName;
    private String studentMobile;
    private String studentEmail;
    private String studentAddress;
    private String studentPassword;
    private String username;
    private  int studentColledgeId;

    /*
    * addStudent()
    * editStudent()
    * deleteStudent()
    * searchStudent()
    *
    *
    * */
}
