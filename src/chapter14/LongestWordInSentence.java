package chapter14;

import java.util.Arrays;

public class LongestWordInSentence {
    public static void main(String[] args) {
        System.out.println(longestWord("What is my names"));
    }

    public static String longestWord(String sentence) {
        String[] input = (sentence.split(" "));
        String longestWord = "";
        for (String word : input) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
