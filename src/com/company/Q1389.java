package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q1389 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        createTargetArray(nums, index);
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
      int[] result = new int[nums.length];
      List<Integer> resultList = new ArrayList<>();

      for (int i = 0; i < nums.length; i++) {
          resultList.add(index[i], nums[i]);
      }

        result = resultList.stream().mapToInt(Integer::intValue).toArray();

      return result;
    };
}
