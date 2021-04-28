package com.company;

public class Q1455 {
    public static void main(String[] args) {
        String sentence = "love errichto jonathan dumb";
        String searchWord = "dumb";

        isPrefixOfWord(sentence, searchWord);
    }

    private static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        String currentWord;
        int wordCount = 0;
        int result = -1;

        for (String str : words) {
            wordCount = wordCount + 1;
            if (searchWord.length() <= str.length()) {
                currentWord = str.substring(0, searchWord.length());
                if (currentWord.equals(searchWord)) {
                    result = wordCount;
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
