package com.company;

public class Q1688 {
    public static void main(String[] args) {
        numberOfMatches(14);
    }

    private static int numberOfMatches(int n) {
        int matches = 0;
        int temp = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                matches = n / 2;
            } else {
                matches = (n - 1) / 2;

            }
            n = n - matches;
            temp = temp + matches;
        }

        return temp;
    }
}
