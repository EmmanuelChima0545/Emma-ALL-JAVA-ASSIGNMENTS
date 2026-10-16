package org.example.UserSystem;

// I can simply use a class and make the class implement the interface ,but I decided to think of a
// way to still use interface and interface
public class AdminAccount implements SystemAdmin {
    @Override
    public void generateReports() {
        System.out.println("Only the system admin generates report");
    }

    @Override
    public void getEmail() {
        System.out.println("Admin email is emmy.com");
    }

    @Override
    public void getPassword() {
        System.out.println("Musa");
    }

    @Override
    public UserType getUserType() {
        return UserType.SYSTEM_ADMIN;
    }

    @Override
    public Gender getGender() {
        return Gender.Male;
    }

    @Override
    public void changePassword() {

    }
}
