package org.example.HashMapAssignment;

import org.example.UserSystem.UserType;

public class User {
    private String email;
    private String password;
    private int age;
    private UserType userType ;

    public User(String email, String password,  int age, UserType userType) {
        this.email = email;
        this.password = password;
        this.age = age;
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }



    public int getAge() {
        return age;
    }

    public UserType getUserType() {
        return userType;
    }
}
