package com.java.class08;

import java.util.Scanner;

public class CheckCharIsVowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to check if it's a vowel in lower case");
        char c = 'a';

        if (c == 'a' || c=='e' || c=='i' || c=='o' || c=='u') {
            System.out.println(" it is a vowel");
        } else {
                System.out.println("It is not a vowel");
        }
    }
}
