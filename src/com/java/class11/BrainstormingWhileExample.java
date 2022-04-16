package com.java.class11;

import java.util.Scanner;

public class BrainstormingWhileExample {
    public static void main(String[] args) {

        // write a program to print below numbers

        // 6 12 18 24 30 36 42 48 54 60

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers we need to print");
        int num = sc.nextInt();
        int i=1;
        int b=1;

        while(i<=num) {
            System.out.println(i);
            i++;
            System.out.println();
        }

    }
}