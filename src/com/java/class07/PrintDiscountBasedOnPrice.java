package com.java.class07;

import java.util.Scanner;

// Take a price from user and print discount value based on price
// less than 100 then print - No discount
// less than 500 then print - 5%
// less than 1000 then print - 10%
// more than or equal to 1000 then print - 15%
public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {

        System.out.println("Enter a price to print discount value");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if (price < 49) {
            System.out.println("no discount");
        } else if (price < 59) {
            System.out.println("5% discount");
        } else if (price < 69) {
            System.out.println("10% discount");
        } else if (price <= 100) {
            System.out.println("15% discount");
            }

        }
    }