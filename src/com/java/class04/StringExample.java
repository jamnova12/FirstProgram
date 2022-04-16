package com.java.class04;

public class StringExample {
    // If we do addition with String it'll be concatenation
    // String + String

    public static void main(String args[]) {
        int a = 10, b = 20, c = 30;
        String str1 = "Hello";
        String str2 = "Java";

        System.out.println(a); //10
        System.out.println(a + b); //30
        System.out.println(str1 + str2); // HelloJava
        System.out.println(str1 + a); //Hello10
        System.out.println(str1 + a + b); // Hello1020
        System.out.println(a + b + str1); //30Hello
        System.out.println("a + b"); // a+b (because it's String, quotations make it a+b)
        System.out.println("a"+b); // a20 (a is String and b is variable of type int
        System.out.println("a" + b + c); // a2030 (a is String and b is variable of type int)
        System.out.println(str1 + a * b); // Hello200 (As per priority we'll do multiplication first and then addition)}
        // System.out.println(str1 a - b); // Error
        System.out.println(a - b + str1); // -10Hello
    }
}