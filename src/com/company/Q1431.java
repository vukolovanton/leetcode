package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1431 {
    public static void main(String[] args) {
        int[] kids = {2,3,5,1,3};
        kidsWithCandies(kids, 3);

//        int[] kids = {2, 8, 7};
//        kidsWithCandies(kids, 1);
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultList = new ArrayList<>(Arrays.asList(new Boolean[candies.length]));
        Collections.fill(resultList, Boolean.FALSE);
        int max = 0;

        for (int i = 0; i < candies.length; i++) {

            if (i != candies.length - 1) {
                if (candies[i] > candies[i + 1]) {
                    if (candies[i] > max) {
                        max = candies[i];
                    }
                }
            } else {
                if (candies[i] > max) {
                    max = candies[i];
                }
            }

            if (max != 0 && candies[i] + extraCandies >= max) {
                resultList.set(i, true);
            }
        }

        System.out.println(max);
        System.out.println(resultList);
        return resultList;
    }
}
