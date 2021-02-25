package com.company;

public class Q1678 {
    public static void main(String[] args) {
        interpret("G()(al)");
    }

    private static String interpret(String command) {
        String result = "";

        result = command.replace("()", "o").replace("(al)", "al");

        return result;
    }
}
