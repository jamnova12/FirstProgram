package com.java.class16;

import java.util.Scanner;

// write a program to take one string from user and print
// occurence of given char in string
public class FindOccurenceOfChar {
    public static void main(String[] args) {


        System.out.println("enter a statement");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = 'a';
        //char c = sc.nextLine.charAt(0);
        // so that user can enter character
        int count = 0;

        for(int i=0; i<str.length(); ++i){
            if(str.charAt(i) == c){
            count++;
            }
        }
        System.out.println(count);


    }
}
