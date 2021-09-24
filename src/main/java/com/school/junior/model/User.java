package com.school.junior.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int userId;
    private int userRoleId;
    private String userName;
    private String email;
    private Date dateOfBirth;
    private String userAddress;

//    addUser();
//    editUser();
//    deleteUser();
//    searchUser();


}
