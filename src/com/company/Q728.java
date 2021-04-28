package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q728 {
    public static void main(String[] args) {
        selfDividingNumbers(1, 22);
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i < right; i++) {
            if (i >= 10) {
                if (isSelfDividing(i)) {
                    result.add(i);
                }
            } else {
                result.add(i);
            }

        }

        System.out.println(result.toString());
        return result;
    }

    private static boolean isSelfDividing(int num) {
        int temp = num;
        int lastDigit = 0;

        while (num > 0) {
            lastDigit = num % 10;

            if (lastDigit == 0) return false;
            else if (temp % lastDigit != 0) return false;
            num = num / 10;
        }

        return true;
    }
}
