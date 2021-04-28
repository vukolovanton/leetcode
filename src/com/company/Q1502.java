package com.company;

import java.util.Arrays;

public class Q1502 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4 };
        canMakeArithmeticProgression(arr);
    }

    private static boolean canMakeArithmeticProgression(int[] arr) {
        boolean result = true;
        Arrays.sort(arr);

        int step = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != step) {
                result = false;
                return result;
            }
        }

        return result;
    }
}
