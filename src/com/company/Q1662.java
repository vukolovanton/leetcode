package com.company;

import java.util.Arrays;

public class Q1662 {
    public static void main(String[] args) {
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result = false;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        Arrays.stream(word1).forEach(s1::append);
        Arrays.stream(word2).forEach(s -> s2.append(s));

        if (s1.compareTo(s2) == 0) {
            result = true;
        }

        System.out.println(result);
        return result;
    }
}
