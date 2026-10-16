package org.example.HashMapAssignment;

import org.example.UserSystem.UserType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserStore {
    static Map<String,User> userDb = new HashMap<>();

    private static void storeUser(String email, User user){
        userDb.put(email, user);
    }

    private static User getUser(String email){
        return userDb.get(email);
    }

    private static void registerUsers(Scanner scanner){
        while (true){
            System.out.println("Please provide user credentials or type 'exit' to finish\n");

            System.out.println("Kindly enter your email address\n");
            String email = scanner.nextLine();

            if(email !=null && email.equalsIgnoreCase("exit")){
                break;
            }

            System.out.println("Kindly enter your password \n");
            String password = scanner.nextLine();

            System.out.println("Kindly enter your age\n");
            int age = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Kindly enter your user type(SYSTEM_ADMIN,CUSTOM_USER)\n");
            String type = scanner.nextLine();

            UserType userType = UserType.valueOf(type);

            User user = new User(email, password,age,userType);
            storeUser(email,user);


        }
    }

    private static void printUsers(){
        for(Map.Entry<String, User> item : userDb.entrySet()){
            User user = item.getValue();
            System.out.println("email: " + user.getEmail());
            System.out.println("age: " + user.getAge());
            System.out.println("password: " + user.getPassword());
            System.out.println("User Type: " + user.getUserType());
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        registerUsers(scanner);

        printUsers();
        scanner.close();
    }
}
