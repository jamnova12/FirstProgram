package com.java.class07;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String loginInput = sc.nextLine();
        System.out.println("Please enter your password:");
        String passwordIn = sc.nextLine();
        String login = "user";
        String password = "pass";

        if(login.equals(loginInput) && password.equals(passwordIn)) {
            System.out.println("Login successful");
        }else if(login.equals(loginInput) & !password.equals(passwordIn)) {
            System.out.println("Invalid password");
        }else if(!login.equals(loginInput) & password.equals(passwordIn)) {
            System.out.println("Invalid username");
        }else {
            System.out.println("Login unsuccessful");
        }
    }
}