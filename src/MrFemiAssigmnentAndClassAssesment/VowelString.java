package MrFemiAssigmnentAndClassAssesment;

public class VowelString {
    public static void main(String[] args) {
        System.out.println(withOutVowelLetters("square"));
    }

    public static String withOutVowelLetters(String input) {
        String wordWithVowel = "";
        int counter = 0;
        int count = 0;
        String[] vowel = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        while (count < input.length()) {
            for (int index = 0; index < vowel.length; index++) {
                counter++;
                String words = String.valueOf(input.charAt(count));
                if (vowel[index].equals(words)) {
                    wordWithVowel += "";
                    break;
                } else if (counter == vowel.length) {
                    wordWithVowel += words;
                }
            }
            counter = 0;
            count++;
        }
        return wordWithVowel;
    }
}
