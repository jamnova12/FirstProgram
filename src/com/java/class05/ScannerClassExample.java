package com.java.class05;

import java.util.Scanner;

public class ScannerClassExample {
    // Scanner Class - To Get user input in program (from keyboard)
    public static void main(String[] args) {
        System.out.println("Enter any two numbers");

        Scanner peel = new Scanner(System.in);

        int num1 = peel.nextInt();
        int num2 = peel.nextInt();

        if(num1 > num2) {
            System.out.println("greater than" + num2);
        } else if (num1 < num2) {
            System.out.println("less than " + num1);
        } else if (num1 >= num2){
            System.out.println(num1 +" is greater than or equal to "+  num2);
        }


    }
}
