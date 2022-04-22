package com.java.class17;

public class HwPrimeNumber1to502 {

    static boolean isPrime2(int num){
        if(num%2==1){
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {

        for(int i = 1; i<=50; i++){
            if(isPrime2(i)){
                System.out.println(i +" is prime");
            } else {
                System.out.println(i+" is not prime");
            }
        }

    }
}
