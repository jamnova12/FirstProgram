package com.java.class13;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        // create 3 string variable
        // initialize two variable with constant value
        // take third variable value from user using Scanner Class
        // compare 1st and 2nd using == operator
        // compare 2nd and 3rd using == operator
        // compare 1st and 3rd using .equals method

        Scanner sc = new Scanner(System.in);

        String i = "Hello";
        String b = "Hello";
        String c = sc.nextLine();

        if (i == b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        if (b == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (i.equals(c)) {
            System.out.println(i + " equals to " + c);
        } else {
            System.out.println(i + " not equals to " + c);
        }

    }
}
