package com.company;

import java.util.*;

public class Q821 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';

        shortestToChar(s, c);
    }

    private static int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        int temp = Integer.MIN_VALUE / 2;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                temp = i;
            }

            result[i] = i - temp;
        }

        temp = Integer.MAX_VALUE;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                temp = i;
            }

            result[i] = Math.min(result[i], temp - i);
        }

        return result;
    }
}
