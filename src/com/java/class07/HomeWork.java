package com.java.class07;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to check if it's a vowel in lower case.");
        String vowel = sc.nextLine();

        switch (vowel) {
            case "a":
                System.out.println("a is a vowel");
                break;
            case "e":
                System.out.println("e is a vowel");
                break;
            case "i":
                System.out.println("i is a vowel");
                break;
            case "o":
                System.out.println("o is a vowel");
                break;
            case "u":
                System.out.println("u is a vowel");
                break;
            default:
                System.out.println("Letter entered is not a vowel or written in upper case.");
        }


    }
}