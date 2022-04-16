package com.java.class15;

import java.util.Scanner;
// Write program to print second half of string

public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

            System.out.println(str.substring(str.length()/2 - 1));
    }

}
