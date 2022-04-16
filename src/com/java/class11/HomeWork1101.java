package com.java.class11;

import java.util.Scanner;

public class HomeWork1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Divisible by 3 and 5");
        int i = 0;

        while (i <= 100) {
            if (i %3==1) {
                System.out.println(i);
            }
            ++i;
        }
    }
}
