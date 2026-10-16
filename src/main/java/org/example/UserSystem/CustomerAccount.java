package org.example.UserSystem;
// I can simply use a class and make the class implement the interface but I decided to think of a
// way to still use interface and interface
public class CustomerAccount implements CustomUser {
    @Override
    public void updateProfilePicture() {
        System.out.println("Only users can update profile picture");
    }

    @Override
    public void getEmail() {
        System.out.println(" User email is User.com");
    }

    @Override
    public void getPassword() {
        System.out.println("Bobo");
    }

    @Override
    public UserType getUserType() {
        return UserType.CUSTOM_USER;
    }

    @Override
    public Gender getGender() {
        return null;
    }

    @Override
    public void changePassword() {
        System.out.println("Custom users can change password");
    }
}
