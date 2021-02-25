package com.company;

import java.util.Optional;

public class Q1768 {
    public static void main(String[] args) {
        mergeAlternately("ab", "pqrs");
    }

    private static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        String longestWord = word1.length() < word2.length() ? word2 : word1;
        String shortestWord = word1.length() < word2.length() ? word1 : word2;
        String slicedWord = longestWord.substring(shortestWord.length());

        for (int i = 0; i < shortestWord.length(); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        };

        for (char c : slicedWord.toCharArray()) {
            sb.append(c);
        }

        return sb.toString();
    }
}
