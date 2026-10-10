package org.example.UserSystem;

public interface GenericUser {
     void getEmail();
     void getPassword();
     UserType getUserType();
     Gender getGender();
     void changePassword();
}
