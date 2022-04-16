package com.java.class04;

public class ComparisionOperatorExample {
    public static void main(String[] args) {
        String str = "Hello";
// it overwrites String str to str
        str = "Java";
        System.out.println(str);

        int a = 10, b = 12, c = 10, d = 8;

        System.out.println(a > b); //false
        System.out.println(a < c); //false
        System.out.println(a >= c); //true
        System.out.println(a <= b); //true
        System.out.println(a <= c); //true
        System.out.println(a != b); //true
        System.out.println(b <= c); //false
        System.out.println(b >= d); //true
        System.out.println(a != c); //false

        // (/*...*/) <- anything inside is multiple lane comment, (start to finish)
    }
}
