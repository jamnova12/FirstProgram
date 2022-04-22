package com.java.class16;

import java.util.Scanner;

//write a program to take one statement from user and find out number of words
// we have inside the statement
public class StringPracticeWordCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a statement");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println(words.length);
    }
}
