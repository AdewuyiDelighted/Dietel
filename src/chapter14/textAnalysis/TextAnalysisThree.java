package chapter14.textAnalysis;

public class TextAnalysisThree {
    public static void main(String[] args) {
        wordLength("To be , or not to be : that is the question : , Whether 'tis nobler in the mind to suffer ");
    }


    public static void wordLength(String text) {
        System.out.printf("%s%18s%n","Word","Count");
        String lowerCase  = text.toLowerCase();
        String[] arrayText = lowerCase.split(" ");
        for (int index = 0; index < arrayText.length; index++) {
            String word = arrayText[index];
            int count = countWord(lowerCase, word);
            System.out.printf("%4s%17s%n", word, count);
        }
    }



    private static int countWord(String text, String word) {
        String[] arrayText = text.split(" ");
        int counter = 0;
        for (int indice = 0; indice < arrayText.length; indice++) {
            if (word.equals(arrayText[indice])) {
                counter++;
            }

        }
        return counter;
    }
}
