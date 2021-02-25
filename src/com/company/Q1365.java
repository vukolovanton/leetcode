package com.company;

import java.util.Arrays;

public class Q1365 {
    public static void main(String[] args) {
        int[] arr = { 6,5,4,8 };
        smallerNumbersThanCurrent(arr);
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    result[i] = result[i] + 1;
                }
            }
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
