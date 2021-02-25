package com.company;

import java.util.Arrays;

public class Q1480 {
    public static void main(String[] args) {
        int[] sum = { 3, 1, 2, 10, 1};
        runningSum(sum);
    }

    private static void runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
