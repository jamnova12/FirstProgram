package com.java.class15;

import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {

        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine(); // F.A Print out
        String parts[] = fullName.split(" ");
        String firstName = parts[0];
        String lastName = parts[1];

        System.out.println(firstName + lastName);




    }
}
