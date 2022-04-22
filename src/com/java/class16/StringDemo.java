package com.java.class16;

public class StringDemo {
    public static void main(String[] args) {


        //String buffer uses the buffer mechanism to protect data from being
        // access and update simultaneously, so it's thread safe, synchronized, but slower
        StringBuffer sBuffer = new StringBuffer("hello");
        sBuffer.reverse();

        // not synchronized, not thread safe, but faster.
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();

    }
}
