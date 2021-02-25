package com.company;

import java.util.Arrays;

public class Q1281 {
    public static void main(String[] args) {
        subtractProductAndSum(4421);
    }

    private static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int temp = 0;

        while (n > 0) {

            product = (product) * ( n % 10);
            sum = sum + n % 10;

            n = n / 10;
        }

        System.out.println(product - sum);
        return product - sum;
    }
}
