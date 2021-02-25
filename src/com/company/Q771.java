package com.company;

import java.util.HashSet;
import java.util.Set;

public class Q771 {
    public static void main(String[] args) {
        numJewelsInStones("aA", "aAAbbbb");
    }

    private static int numJewelsInStones(String jewels, String stones) {
//        int result = 0;
//
//        for (int i = 0; i < jewels.length(); i++) {
//            for (int j = 0; j < stones.length(); j++) {
//                if (stones.charAt(j) == jewels.charAt(i)) {
//                    result = result + 1;
//                }
//            }
//        }
//
//        return result;

        int res = 0;
        Set setJ = new HashSet();
        for (char j: jewels.toCharArray())
            setJ.add(j);
        for (char s: stones.toCharArray())
            if (setJ.contains(s)) res++;
        return res;
    }
}
