package mrjonathanExercise;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] input) {
        String strOfInput = "";
        for (int index = 0; index < input.length; index++) {
            strOfInput += input[index];
        }
        String strAdd = calculateString(strOfInput);
        return convertStringToArray(strAdd);
    }


    private static String calculateString(String strOfInput) {
        String answer = "";
        for (int strCount = 0; strCount < strOfInput.length(); strCount++){
            int answerInInt = Integer.parseInt(strOfInput) + 1;
            answer = String.valueOf(answerInInt);
        }
        return answer;
    }

    private static int[] convertStringToArray(String strInput) {
        int[] array = new int[strInput.length()];
        for (int count = 0; count < strInput.length(); count++) {
            String charInt = String.valueOf(strInput.charAt(count));
            array[count] = Integer.parseInt(charInt);
        }
        return array;
    }
}
