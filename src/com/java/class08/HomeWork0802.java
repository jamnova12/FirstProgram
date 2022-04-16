package com.java.class08;

import java.util.Scanner;

// 2.  Write a program to get T-shirt size in inches and print size based on inches
//If inches is 27 to 30 Print XS
//If inches is 31 to 34 Print S
//If inches is 35 to 38 Print L
//If inches is 39 to 42 Print XL
//If inches is 45 to 50 Print XXL

public class HomeWork0802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("T-shirt size in Inches:");

        int inches = sc.nextInt();

        if (inches >= 27 && inches <= 30) {
            System.out.println("XS");
        } else if (inches >= 31 && inches <=34) {
            System.out.println("S");
        } else if (inches >= 35 && inches <= 38) {
            System.out.println("L");
        } else if (inches >= 39 && inches <= 42) {
            System.out.println("XL");
        } else if (inches >= 45 && inches <= 50) {
            System.out.println("XXL");
        } else {
            System.out.println("T-shirt size couldn't be found");
        }

    }
}
