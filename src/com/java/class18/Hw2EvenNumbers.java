package com.java.class18;

//  2.   Write a program to print all even numbers which are divisible by 6 from 1 to 50
public class Hw2EvenNumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (isDivisible(i) == true) {
                System.out.println(i);
            }
        }
    }

    static boolean isDivisible(int num) {
        int count = 0;
        for (int i = 1; i <= num; ++i) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 4) {
            return true;
        } else {
            return false;
        }


    }
}
