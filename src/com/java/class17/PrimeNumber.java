package com.java.class17;
// write a program to check given number is prime or not
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("input number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;


        for(int i=1; i<=num; i++) {
            if (num % i == 0) {
            count++;
            }
        }

        if(count==2){
            System.out.println("prime");
        } else {
            System.out.println("Not prime");
        }

    }
}
