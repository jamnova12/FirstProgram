package com.java.class17;

import java.util.Scanner;

// Find divisor of given number (Input - 6, output will be 1 2 3 6)
public class Hw1 {
    public static void main(String[] args) {

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }


    }
}
