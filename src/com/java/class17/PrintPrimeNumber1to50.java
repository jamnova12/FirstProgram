package com.java.class17;

public class PrintPrimeNumber1to50 {
    public static void main(String[] args) {

        int count = 0;
        for(int i=1; i<=50; i++) {
            if (50 % i == 2) {
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
