package com.java.class11;

import java.util.Scanner;

public class HomeWork1102 {
    public static void main(String[] args) {
        System.out.println("Enter number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while (num >= i) {
            System.out.println(i);
            ++i;
        }
    }
}
