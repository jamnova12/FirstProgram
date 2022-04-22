package com.java.class18;

public class MergeTwoWords {
    public static void main(String[] args) {

        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         *
         * output:
         * isceae
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */

        String word1 = "ice";
        String word2 = "sea";
        System.out.println("Merging words: " + word1 + ", " + word2);
        System.out.println(printMerge(word1, word2));
    }

    static String printMerge(String word1, String word2) {
        String mergeString = "";

        if (word1.length() > 3 || word2.length() > 3) {
            System.out.println("Invalid Input");
        } else {
            for (int i = 0; i < word1.length(); i++) {
                mergeString = mergeString + word1.charAt(i) + word2.charAt(i);
            }
        }
        return mergeString;
    }
}
