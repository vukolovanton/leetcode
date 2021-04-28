package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Q1748 {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,2, 9, 2 };
        sumOfUnique(arr);
    }

    private static int sumOfUnique(int[] nums) {
        int bucket[] = new int[10];
        int sum = 0;
        for (int num : nums) {
//            if (bucket[num] == 0) {
//                sum += num;
//            } else if (bucket[num] == 1){
//                sum -= num;
//            }
            bucket[num]++;
        }

        System.out.println(Arrays.toString(bucket));
        return sum;
    }
}
