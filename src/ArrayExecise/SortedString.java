package ArrayExecise;

import ArrayExecise.InvalidInputException;


public class SortedString {

    public static String sortStrings(String words) {
        validateLowercase(words);
        char[] wordArray = convertStringToArray(words);
        int count = 0;
        for (int index = 0; index < wordArray.length; index++) {
            while (count < wordArray.length - 1) {
                count++;

                int numericalValueOfIndex = wordArray[index];
                int numericalValueOfCount = wordArray[count];
                int smallestChar = numericalValueOfIndex;
                if (numericalValueOfCount < numericalValueOfIndex) {
                    smallestChar = numericalValueOfCount;
                    char temp = wordArray[index];
                    wordArray[index] = wordArray[count];
                    wordArray[count] = temp;
                }
            }
            count = index + 1;
        }
        return convertArrayToString(wordArray);
    }


    private static char[] convertStringToArray(String words) {
        char[] arrayOfWord = new char[words.length()];
        for (int index = 0; index < words.length(); index++) {
            arrayOfWord[index] = (words.charAt(index));
        }
        return arrayOfWord;
    }

    private static String convertArrayToString(char[] word) {
        String arrayToString = "";
        for (int index = 0; index < word.length; index++) {
            arrayToString += word[index];
        }
        return arrayToString;
    }

    private static void validateLowercase(String word) {
        for (int index = 0; index < word.length(); index++) {
            String check = String.valueOf(word.charAt(index));
            if (check != check.toLowerCase()) throw new InvalidInputException("Invalid input");
        }
    }
}

