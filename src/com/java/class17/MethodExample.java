package com.java.class17;

import java.util.Locale;
import java.util.Scanner;

public class MethodExample {
// you can put the following below anywhere you want, but usually it's put up top because it's easier to read it.
// instead of scrolling all the way down.

    /*static void printLine() {
        System.out.println("========================");
    }*/

    /*static void printLineEqual(int length) {


        for (int i = 1; i <= length; i++) {
            System.out.print("=");
        }
        System.out.println();
    }*/

    static void printLineEqual(int length, char c) {


        for (int i = 1; i <= length; i++) {
            System.out.print(c);
        }
        System.out.println();

    }

        public static void main(String[] args) {
        printLineEqual(20,'=');
        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printLineEqual(20,'+');
        System.out.println("Please enter second number");
        int b = sc.nextInt();
        printLineEqual(20,'*');
        System.out.println("Please enter the operation (Add /Div /Sub/ Mul");
        String operation = sc.next();

        switch (operation.toLowerCase()) {
            case "add":
                System.out.println(a + b);
                break;
            case "div":
                System.out.println(a / b);
                break;
            case "sub":
                System.out.println(a - b);
                break;
            case "mul":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Invalid choice, choose one of the options above");

        }

    }
}
