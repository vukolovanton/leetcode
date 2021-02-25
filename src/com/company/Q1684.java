package com.company;

import java.util.HashSet;

public class Q1684 {
    public static void main(String[] args) {
        String[] arr = { "n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis" };
        countConsistentStrings("fstqyienx", arr);

//        String[] arr = { "a","b","c","ab","ac","bc","abc" };
//        countConsistentStrings("abc", arr);
    }

    private static int countConsistentStrings(String allowed, String[] words) {
        int notFound = 0;

        HashSet<Character> charSet = new HashSet<>();

        for (char c : allowed.toCharArray()) {
            charSet.add(c);
        }

        for (String string : words) {
            for (int i = 0; i < string.length(); i++) {
                if (!charSet.contains(string.charAt(i))) {
                    notFound = notFound + 1;
                    break;
                }
            }
        }

        return words.length - notFound;
    }
}
