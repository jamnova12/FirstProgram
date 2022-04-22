package com.java.class17;
// write a program to check odd/even number from to 15
public class MethodExamples2 {

    static boolean isEven(int num){
        if(num%2==0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        for(int i =1; i<=15; i++){
            if(isEven(i)){
                System.out.println(i+" is Even");
            } else {
                System.out.println(i+" is Odd");
            }
        }


    }
}
