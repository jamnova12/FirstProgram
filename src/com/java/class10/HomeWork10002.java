package com.java.class10;

import java.util.Scanner;

public class HomeWork10002 {
    public static void main(String[] args) {

       /* int i = 1;

        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}

/* int i = 10;

        while(i>=1){
            System.out.println(i);
            --i;
 */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while (num >= i) {
                System.out.println(i*3);
                ++i;
            }

    }
}