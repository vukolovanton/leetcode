package com.company;

public class Q1342 {
    public static void main(String[] args) {
        numberOfSteps(8);
    }

    private static int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps = steps + 1;
        }

        System.out.println(steps);
        return steps;
    }
}
