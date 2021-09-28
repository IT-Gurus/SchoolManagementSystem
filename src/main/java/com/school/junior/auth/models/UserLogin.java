package com.school.junior.auth.models;

import lombok.Data;


import java.lang.reflect.Array;
import java.util.*;

@Data
public class UserLogin {
    private final String username;
    private final String password;

    public UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
