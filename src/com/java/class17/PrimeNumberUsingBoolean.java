package com.java.class17;
// write a program to check given number is prime or not
import java.util.Scanner;

public class PrimeNumberUsingBoolean {
    public static void main(String[] args) {

        System.out.println("input number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;


        for(int i=2; i<num; i++) {
            System.out.println("We are diving " +num+" with "+i);
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }


    }
}
