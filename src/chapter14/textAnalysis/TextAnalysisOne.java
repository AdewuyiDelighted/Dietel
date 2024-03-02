package chapter14.textAnalysis;

public class TextAnalysisOne {
    public static void main(String[] args) {
        countAllLetters("TO be of not be : that is a question");
    }

    public static void countAllLetters(String text) {
        System.out.printf("%s%8s%n","Letters","Count");
        String lowerCaseText = text.toLowerCase();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int letters = 0; letters < alphabets.length(); letters++) {
            int count = count(lowerCaseText,alphabets.charAt(letters));
            System.out.printf("%s%10d%n",alphabets.charAt(letters),count);
        }
    }

    public static int count(String word, char target) {
        int counter = 0;
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == target) {
                counter++;
            }
        }
        return counter;
    }
}
