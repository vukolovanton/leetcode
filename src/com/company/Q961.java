package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q961 {
    public static void main(String[] args) {
        int[] arr = { 8,5,1,5,2,5,3,5,4 };
        repeatedNTimes(arr);
    }

    private static int repeatedNTimes(int[] A) {
        int result = 0;
        HashSet<Integer> nums = new HashSet<>();

        for (int a : A) {
            if (nums.contains(a)) {
                result = a;
            }
            nums.add(a);
        }

        return result;
    }
}
