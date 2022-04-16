package com.java.class14;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to DevX!";

        // 1. we want to check equality of two string
        System.out.println(str1.equals(str2));
        System.out.println("===========================================");

        // 2.  check quality of two string ignoring case
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("===========================================");

        //3. check one string contains another String
        // if what's written in str3 matches str1 then true.
        System.out.println(str3.contains(str1));
        System.out.println("===========================================");


        //4. check one string contains another String
        // str1 is not the same as str3 therefor it will be false
        System.out.println(str1.contains(str3));
        System.out.println(str3.contains(str2));
        System.out.println("===========================================");


        //5. changing the case of String
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());
        System.out.println("===========================================");


        // Case Sensitive example - false because "Hello World!" is not the same as "hello World!"
        System.out.println(str1.contains(str2));
        System.out.println("===========================================");


        // Examples how to ignore casing and compare 2 string. - true example : "Hello World!" & "hello World!"
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();

        //Comparing new string that's been converted to lowercase to other string that's been converted to Lower Case
        System.out.println("Comparing in lowercase:"+str3LowerCase.contains(str2LowerCase));

        // Example of everything put together into 1 line. So that you don't need more Strings
        System.out.println("Comparing in Uppercase:"+str3.toUpperCase().contains(str1.toUpperCase()));
        System.out.println("===========================================");


        //6. Find index of character, it goes from right to left starting from 0
        str1 = "Hello World";
        System.out.println("6. Index of Char: " +str1.indexOf('l'));
        //6.1 Last index of Char
        System.out.println("6.2. Last Index of Char: " +str3.lastIndexOf('W'));
        System.out.println("===========================================");


        //7. Find character at index, space is printed, you can highlight to see it.
        System.out.println("7. Index of Char: " +str1.charAt(0));
        System.out.println("===========================================");


        //8. Length of String
        str1 = "Hello World";
        str3 = "Hello World! Welcome to DevX!";
        System.out.println("8. Length of string " + str1.length());
        System.out.println("8. Length of string " + str3.length());
        System.out.println("===========================================");

        //9. Empty and Blank examples
        str1 = "                  ";
        str3 = "";
        System.out.println("8. Empty: " +str1.isEmpty());  // it's not empty because the space is considered
        System.out.println("8. Empty: " +str3.isEmpty());
        System.out.println("8. Blank: " +str1.isBlank());  // is it blank? true because space is considered blank
        System.out.println("8. Blank: " +str3.isBlank());
        System.out.println("===========================================");


        //10. Replace & ReplaceAll
        str1 = "Welcome User100";
        str3 = "Devx1";
        System.out.println("Replace: " + str1.toUpperCase().replaceAll("[A-Z]", "")); // complicated way
        System.out.println("Replace: " + str3.replaceAll("[A-Za-z]", "L")); //simpler way

        System.out.println(str1.replace("user",str3)); // replaces what's inside str1 in the target "quotes" with str3
        System.out.println(str1.replace(str1, str3)); // replaces all str1 with str3
        System.out.println(str1.replace("Welcome", "Devx")); //replaces what's in str1 target "quotes" with input I type
        System.out.println("===========================================");


        //11. Format replaces %s
        str1 = "Welcome %s, Welcome to %s";
        System.out.println(String.format(str1,"Chirag", "Ebay"));
        System.out.println("===========================================");


        //12. Substring
        str1 = "Welcome too java class. Today is fun day";
        System.out.println("Substring " +str1.substring(7)); // starting from index=0(W) to index=7=("space") substring is -1 so space will not appear.
        System.out.println("Substring " +str1.substring(0,11)); // it will print 0,11 beginIndex # to endIndex #
        System.out.println("===========================================");


        //13. Split
        str1 = "King Welcome Burger Hello! to";
        String[] words = str1.split(" ");
        System.out.println("Split: " +words[1]+words[2]+words[0]); // this method doesn't give spaces and you have to type each one 1 by 1. time consuming

        System.out.println("===========================================");
        System.out.println(words[3]);
        System.out.println(words[1]);
        System.out.println(words[4]);
        System.out.println(words[2]);
        System.out.println(words[0]);
        System.out.println("===========================================");
        System.out.println(str1.charAt(0) + "." + str1.charAt(1) + "." + str1.charAt(2));


        System.out.println("===========================================");
        System.out.println("Split: " +words[3]+" "+words[1]+" "+words[4]+" "+words[2]+" "+words[0]);

        System.out.println("===========================================");
        System.out.println(words.length + " printing the length of words"); // printing the length of words in str1

        System.out.println("===========================================");
        for(int i=0; i<words.length; i++){   // example how print all without doing sout
            System.out.println(words[i]);
        }
        System.out.println("===========================================");





    }
}
