package org.example.UserSystem;

public interface CustomUser  extends GenericUser{


    @Override
    default void getEmail(){
        System.out.println("chimaemmanuel372@gmail.com");
    }

    @Override
    default void getPassword(){
        System.out.println("qkusjnzx");
    }

    @Override
    default UserType getUserType(){
        System.out.println("User type is " + UserType.CustomUser);
        return UserType.CustomUser;
    }
    @Override
    default Gender getGender(){
        System.out.println("The gender is : " + Gender.Female);
        return Gender.Female;
    }

    default void changePassword(){
        System.out.println("Custom Users can change their password");
    }

    default void updateProfilePicture(){
        System.out.println("Only the Custom User is permitted to update profile picture");

    }
}
