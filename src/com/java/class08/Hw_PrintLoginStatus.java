package com.java.class08;

import java.util.Scanner;

public class Hw_PrintLoginStatus {

    public static void main(String[] args) {
        System.out.println("Please enter username & password: ");
        Scanner sc = new Scanner(System.in);
        String username1 = "bread";
        String password1 = "loaf";
        String username= sc.nextLine(), password= sc.nextLine();

        if (username1.equals(username) && password1.equals(password)) {
            System.out.println("Login Successful");
        } else if (username1.equals(username) || password1.equals(username)) {
            System.out.println("Incorrect password");
        } else if (username1.equals(password) || password1.equals(password)) {
            System.out.println("Incorrect Username");
        } else  {
            System.out.println("Unsuccessful Login");
        }
    }
}