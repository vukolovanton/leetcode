package com.company;

import java.util.Arrays;

public class Q1528 {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,0};
        restoreString("aiohn", arr);

    }

    private static String restoreString(String s, int[] indices) {
        char[] charArr = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            charArr[i] = s.charAt(indices[i]);
        }

        return (String.valueOf(charArr));
    }
}
