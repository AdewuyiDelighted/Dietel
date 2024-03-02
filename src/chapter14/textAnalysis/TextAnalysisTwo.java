package chapter14.textAnalysis;

import chapter14.LongestWordInSentence;

public class TextAnalysisTwo {
    public static void main(String[] args) {
        countWordLength("Whether `tis nobler in the mind to suffer");
    }

    public static void countWordLength(String text) {
        String word = LongestWordInSentence.longestWord(text);
        int length = word.length();
        int counter = 0;

        for (int letterCounter = 1; letterCounter <= length; letterCounter++) {
            counter = countWord(text, letterCounter);
            System.out.printf("%d%10d%n", letterCounter, counter);
        }

    }

    private static int countWord(String text, int count) {
        int counter = 0;
        String[] arrayText = text.split(" ");
        for (int index = 0; index < arrayText.length; index++) {
            if (arrayText[index].length() == count) {
                counter++;
            }
        }
        return counter;
    }
}
