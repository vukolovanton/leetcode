package com.company;

public class Q1464 {
    public static void main(String[] args) {
//        int[] arr = { 3, 4, 5, 2 };
//        int[] arr = { 1, 5, 4, 5 };
//        int[] arr = { 3, 7 };
        int[] arr = { 10, 2, 5, 2 };
        maxProduct(arr);
    }

    private static int maxProduct(int[] nums) {
        int result = 0;
        int maxNumber = 0;
        int secondMaxNumber = 0;

        for (int num : nums) {
            if (num >= maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = num;
            } else if (num > secondMaxNumber) {
                secondMaxNumber = num;
            }
        }

        result = (maxNumber - 1) * (secondMaxNumber - 1);
        return result;
    }
}
