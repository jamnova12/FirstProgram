package com.java.class05;

import java.util.Scanner;

// Write a program to check given number is odd or even.
public class IfElseExample2 {

    public static void main(String args[]) {
        System.out.println("Enter any number 10");

        Scanner sc = new Scanner ((System.in));
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("2. Odd");
        } else {
            System.out.println("3. Even");
        }
        System.out.println("4. End");
    }
}

// int num1 = nextInt(), num2 = nextInt() <- it's going to input data typed by user,
// Sc.nextInt() inputs data automatically


