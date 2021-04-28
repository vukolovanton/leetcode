package com.company;

import java.util.Arrays;

public class Q1475 {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 6, 2, 3 };
        finalPrices(arr);
    }

    private static int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length; j++) {
                if (j > i && prices[j] <= prices[i]) {
                    System.out.println(prices[i]);
                    System.out.println(prices[j]);

                    result[i] = prices[i] - prices[j];
                }
            }
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
