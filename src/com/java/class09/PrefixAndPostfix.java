package com.java.class09;

public class PrefixAndPostfix {
    public static void main(String[] args) {
        int i = 1;
        int j = 4;
        int k = i++ + j++;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
