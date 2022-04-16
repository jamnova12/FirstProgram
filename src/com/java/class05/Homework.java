package com.java.class05;

import java.util.Scanner;

public class Homework {
    public static void main(String [] args){
        System.out.println("Is it dividable by 5? Enter numbers");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 % 5 == 0) {
            System.out.println(num1 + " is dividable by 5 " );
        } else if (num2 % 5 == 1) {
            System.out.println(num2 + "is not dividable by 5 " );
        }

    }
}
