package ArrayExecise;

import java.util.Arrays;

public class SortedString {

    public static String sortStrings(String words) {
        String[] wordArray = convertStringToArray(words);
        int count = 0;
        for (int index = 0; index < wordArray.length; index++) {
            while (count < wordArray.length - 1){
                count++;

                int numericalValueOfIndex = words.charAt(index);
                int numericalValueOfCount = words.charAt(count);

                if (numericalValueOfCount < numericalValueOfIndex) {
                    wordArray[index] = String.valueOf(words.charAt(count));
                    wordArray[count] = String.valueOf(words.charAt(index));
                }
            }
            count = index + 1;
        }
        return convertArrayToString(wordArray);
    }


    private static String[] convertStringToArray(String words) {
        String[] arrayOfWord = new String[words.length()];
        for (int index = 0; index < words.length(); index++) {
            arrayOfWord[index] = String.valueOf(words.charAt(index));
        }
        return arrayOfWord;
    }

    private static String convertArrayToString(String[] word) {
        String arrayToString = "";
        for (int index = 0; index < word.length; index++){
            arrayToString += word[index];
        }
        return arrayToString;
    }


}

