package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q657 {
    public static void main(String[] args) {
        judgeCircle("LL");
    }

    private static boolean judgeCircle(String moves) {
        boolean result = false;
        int x = 0;
        int y = 0;

        for (char c : moves.toCharArray()) {
            switch (c) {
                case ('U'):
                    y = y + 1;
                    break;
                case ('D'):
                    y = y - 1;
                    break;
                case ('L'):
                    x = x - 1;
                    break;
                case ('R'):
                    x = x + 1;
                    break;
            }
        }

        if (x == 0 && y == 0) {
            result = true;
        }
        return result;
    }
}
