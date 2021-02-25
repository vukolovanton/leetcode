package com.company;

import java.util.Arrays;

public class Q1470 {
    public static void main(String[] args) {
        int[] nums = { 2,5,1,3,4,7 };
        shuffle(nums, 3);
    }

    private static  int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int[] leftHalf = Arrays.copyOfRange(nums, 0, n);
        int[] rightHalf = Arrays.copyOfRange(nums, n, nums.length);
        int l = 0;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = leftHalf[l];
                l++;
            } else {
                result[i] = rightHalf[r];
                r++;
            }
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
