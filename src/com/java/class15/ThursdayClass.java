package com.java.class15;

import java.util.Scanner;

public class ThursdayClass {
    public static void main(String[] args) {
        /* Take two words from the user and concatenate two words together
* however if the concatenation creates a  double char, then omit one of the characters. Save the result of concatenation and print it out.
                * ex:
         * "abc" "cat" -> "abcat"
                *
         * ex2:
         * abc", "xyz" -> "abcxyz"
                *
         * ex3:
         * "happy", "yolk" -> "happyolk"
                */

        System.out.println("Enter two words");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String b = sc.nextLine();
        String c = "";
        if(i.charAt(i.length()-1) == (b.charAt(0))) {
            c = i + b.substring(1);
        } else {
            c = i + b;
        }
        System.out.println(c);


    }
}
