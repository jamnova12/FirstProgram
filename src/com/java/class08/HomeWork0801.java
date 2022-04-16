package com.java.class08;

import java.util.Scanner;

// Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
//If marks are from 90 to 100 Print A
//If marks are from 80 to 89 Print B
//If marks are from 70 to 79 Print C
//If marks are from 60 to 69 Print D
//If marks are from 50 to 59 Print E
//If marks are from 0 to 49 Print Fail

public class HomeWork0801 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type Marks:");
        int mark = sc.nextInt();


        if (mark <= 49) {
            System.out.println("Print Fail");
        } else if (mark <= 59) {
            System.out.println("E");
        } else if (mark <= 69) {
            System.out.println("D");
        } else if (mark <= 79) {
            System.out.println("C");
        } else if (mark <= 89) {
            System.out.println("B");
        } else if (mark <= 100) {
            System.out.println("A");
        }

    }
}
