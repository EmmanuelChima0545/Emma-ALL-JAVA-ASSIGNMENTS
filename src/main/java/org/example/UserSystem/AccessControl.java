package org.example.UserSystem;

public class AccessControl {
    public static void main(String[] args) {
        SystemAdmin ebuka = new AdminAccount();
        CustomUser chinasa = new CustomerAccount();

        ebuka.generateReports();
        ebuka.getGender();
        ebuka.getUserType();


        chinasa.updateProfilePicture();
        chinasa.getUserType();
        chinasa.getGender();
    }
}
