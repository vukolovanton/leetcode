package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q344 {
    public static void main(String[] args) {
        char[] arr = { 'e', 'l', 'k', 'c', 'i', 'p' };
        reverseString(arr);
    }

    private static void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }

        System.out.println(Arrays.toString(s));
    }

}
