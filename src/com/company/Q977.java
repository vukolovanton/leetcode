package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Q977 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 2 };
        int arr2[] = { 9, 1, 4, 4 };
        sameButSquared(arr1, arr2);
    }

    private static boolean sameButSquared(int[] arr1, int[] arr2) {
        Map<Integer, Integer> frequencyCounter1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> frequencyCounter2 = new HashMap<Integer, Integer>();
        boolean result = true;

        for (int val : arr1) {
            if (frequencyCounter1.containsKey(val)) {
                frequencyCounter1.put(val, frequencyCounter1.get(val) + 1);
            } else {
                frequencyCounter1.put(val, 1);
            }
        }

        for (int val : arr2) {
            if (frequencyCounter2.containsKey(val)) {
                frequencyCounter2.put(val, frequencyCounter2.get(val) + 1);
            } else {
                frequencyCounter2.put(val, 1);
            }
        }

        for (int key : frequencyCounter1.keySet()) {
            if (!frequencyCounter2.containsKey(key * key)) {
                result = false;
            }
        }

        return result;
    }

}
