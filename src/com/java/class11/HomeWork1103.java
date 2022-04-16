package com.java.class11;

public class HomeWork1103 {
    public static void main(String[] args) {


        int i = 1;

        while (i <= 50) {
            if (i % 3 != 0) {
                System.out.println(i + " Not divisible by 3");
            }
            ++i;

            if (i % 7 == 0) {
                System.out.println(i + " Is divisible by 7");
            }
            ++i;

        }
    }
}
