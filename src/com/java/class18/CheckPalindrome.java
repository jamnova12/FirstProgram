package com.java.class18;

import java.util.Scanner;

//write a program to check given string is palindrome or not
public class CheckPalindrome {
    public static void main(String[] args) {

        System.out.println("enter input");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        for (int i = str.length()-1; i >= 0; --i){
            System.out.println(str.charAt(i));
        }
    }
}

