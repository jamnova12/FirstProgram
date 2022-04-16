package com.java.class07;

public class Test {
    public static void main(String[] args) {
            String stringToSwitch = "A";

            switch (stringToSwitch) {
                case "a":
                    System.out.println("a");
                    break;

                case "A":
                    System.out.println("A"); //the code goes here
                    break;

                case "B":
                    System.out.println("B");
                    break;

                default:
                    break;
            }
    }

}
