package com.company;

import java.util.Arrays;

public class Q1299 {
    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        replaceElements(arr);
    }

    private static int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = max;
            max = Math.max(arr[i], max);

        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
