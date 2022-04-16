package com.java.class07;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter given product name");
        String product = sc.nextLine();

        switch (product) {
            case "gmail":
            case "Gmail":
            case "youtube":
            case "Youtube":
            case "Hangouts":
            case "hangouts":
                System.out.println("It is a google product");
                break;
            case "skype":
            case "Skype":
            case "outlook":
            case "Outlook":
                System.out.println("It is a Microsoft product");
                break;
            case "whatsapp":
            case "Whatsapp":
                System.out.println("It is a Facebook product");

        }


    }
}