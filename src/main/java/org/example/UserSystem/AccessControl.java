package org.example.UserSystem;

public class AccessControl {
    public static void main(String[] args) {
        SystemAdmin system_admin = new AdminAccount();
        CustomUser custom_user = new CustomerAccount();

        system_admin.generateReports();
        system_admin.getEmail();


        custom_user.updateProfilePicture();
        custom_user.getEmail();

        UserType adminUserType = system_admin.getUserType(); // doing it like this
        //takes up space from the stack memory . Most times you do it directly
        // However, if you need to do further processing then you can store it somewhere.
        UserType customUserType = custom_user.getUserType();

        System.out.println("System Admin is " + adminUserType);
        System.out.println("Custom User is " + customUserType);
    }
}
