package com.java.class12;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalAmount = 200;


        String serviceQuality = "";

        System.out.println("How was the restaurant's service?");
        serviceQuality = scanner.nextLine();

        if (serviceQuality.equals("bad")) {
            System.out.println(totalAmount * 0.1 / 100);
        }else if (serviceQuality.equals("ok")) {
            System.out.println(totalAmount * 0.15 / 100);
        } else if (serviceQuality.equals("good")) {
            System.out.println(totalAmount * 0.20 / 100);
        } else if (serviceQuality.equals("perfect")){
            System.out.println(totalAmount * 0.25 / 100);
        }

    }
}
