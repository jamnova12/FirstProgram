package com.java.class15;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        // write a program to print each component of address into separate line
        String address = "B604, Cosmos Society, Magarpatta City, Pune, 411013";
        String[] words = address.split(",");
        for( int i = 0; i<words.length; i++) {
            System.out.println(words[i]);
        }
           /* System.out.println(words[0].trim());
            System.out.println(words[1].trim());
            System.out.println(words[2].trim());
            System.out.println(words[3].trim());
            System.out.println(words[4].trim()); */

    }
}
