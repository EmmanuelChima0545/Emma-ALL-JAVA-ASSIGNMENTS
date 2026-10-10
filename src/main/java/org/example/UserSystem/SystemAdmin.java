package org.example.UserSystem;

public interface SystemAdmin extends GenericUser {

    @Override
     default void getEmail(){
        System.out.println("onyensochima@gmail.com");
    }

    @Override
    default void getPassword(){
        System.out.println("mrcfumsa");
    }

    @Override
    default UserType getUserType(){
        System.out.println("User Type is: " + UserType.SystemAdmin);
        return UserType.SystemAdmin;
    }
    @Override
    default Gender getGender(){
        System.out.println("The gender is : " + Gender.Male);
        return Gender.Male;
    }

     default void changePassword(){
        System.out.println("System Admins can change their password");
    }

    default void generateReports(){
        System.out.println("Only the System Admin is permitted to generate reports");

    }

}
