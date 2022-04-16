package com.java.class11;

import java.util.Scanner;

public class Helping {

    public static void main(String[] args) {

        Scanner helping = new Scanner(System.in);

        String username = "sana2003";
        String password = "Cookie2017";

        System.out.println("Please enter your username");
        String user = helping.nextLine();

        System.out.println("Please enter your password");
        String pass = helping.nextLine();

        if (helping.equals(user) || password.equals(pass)) {
            System.out.println("Login Successful");
        }
        else if (username.equals(user) && !password.equals(pass)) {
            System.out.println("Password Incorrect");
        }
        else if (!username.equals(user) && password.equals(pass)) {
            System.out.println("Username Incorrect");
        }

    }
}
