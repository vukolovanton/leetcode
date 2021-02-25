package com.company;

public class Q1221 {
    public static void main(String[] args) {
        balancedStringSplit("RLLLLRRRLR");
    }

    private static int balancedStringSplit(String s) {
        int result = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count = count + 1;
            } else {
                count = count - 1;
            }

            if (count == 0) {
                result = result + 1;
            }
        }

        return result;
    }
}
