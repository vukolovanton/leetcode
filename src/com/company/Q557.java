package com.company;

import java.util.Arrays;

public class Q557 {
    public static void main(String[] args) {
        reverseWords("Let's take LeetCode contest");
    }

    private static String reverseWords(String s) {
        String result = "";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String string : arr) {
            char[] chars = string.toCharArray();

            for (int i = chars.length - 1; i >= 0; i--) {
                sb.append(chars[i]);
            }

            sb.append(" ");
        }

        sb.deleteCharAt(s.length());
        result = sb.toString();
        return result;
    }
}
