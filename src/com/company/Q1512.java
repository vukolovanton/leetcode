package com.company;

public class Q1512 {
    public static void main(String[] args) {
        int[] arr = { 1,1,1,1 };
        numIdenticalPairs(arr);
    }

    private static int numIdenticalPairs(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (i < j) {
                        result = result + 1;
                    }
                }
            }
        }

        return result;
    }
}
