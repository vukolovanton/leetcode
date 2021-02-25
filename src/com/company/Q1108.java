package com.company;

import java.util.Arrays;
import java.util.List;

public class Q1108 {
    public static void main(String[] args) {
        defangIpAddr("255.100.50.0");
    }

    private static String defangIpAddr(String address) {
        String[] arr = address.split("[.]");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append("[.]");
            }
        }

        return result.toString();
//
//        String[] arr = address.split("[.]");
//        String result = String.join("[.]", arr);
//        return result;

    }
}
