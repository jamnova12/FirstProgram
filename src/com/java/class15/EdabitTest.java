package com.java.class15;

import java.util.Scanner;

public class EdabitTest {
    public static void main(String[] args) {


        System.out.println("Input");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String c = "@";

        System.out.println(str.replace(" ", c));

    }
}
