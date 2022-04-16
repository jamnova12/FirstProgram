package com.java.class08;

import java.util.Scanner;

public class HomeWork0803 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 5 != 1) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Divisible by 3");
        }

    }
}
