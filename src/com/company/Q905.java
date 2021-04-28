package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q905 {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        sortArrayByParity(arr);
    }

    private static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];

        for (int i = 0, j = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int temp = A[i];
                A[i] = A[j];
                A[j++] = temp;
                System.out.println(j);
            }
        }

        return result;
    }
}
