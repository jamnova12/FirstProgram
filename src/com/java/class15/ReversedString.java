package com.java.class15;

import java.util.Scanner;

// Print Reverse of Given String
public class ReversedString {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.equals(getReverse(str))){
            System.out.println("It's Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        //isPalindrome(str);
    }


    static String getReverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return rev;

        /*if (rev.equals(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }*/
    }
}