package com.school.junior.model;

import lombok.Data;

import java.util.Date;

@Data
public class Registration {
    private int registrationId;
    private String registrationType;
    private String registrationDescription;
    private int registrationStudentId;
    private String registrationName;
    private Date registrationDate;

    /*
    * addRegistration()
    * editRegistration()
    * deleteRegistration()
    * searchRegistration();
    *
    *
    * */
}
