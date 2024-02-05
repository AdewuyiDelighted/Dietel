package mrjonathanExercise;

import ArrayExecise.Convert;


import java.util.ArrayList;


public class HighestCommonFactor {

    public static int[] highestCommonFactor(int[] input) {
        int holdOne = 0;
        int counter = 0;
        int possibleFactor = 2;
        ArrayList<Integer> hcf = new ArrayList<>();
        while (holdOne != 1) {
            for (int index = 0; index < input.length; index++) {
                if (input[index] % possibleFactor == 0) counter++;
            }
            if (counter == input.length) {
                hcf.add(possibleFactor);
                holdOne = divideElement(input, possibleFactor, holdOne);
            }
            if (counter != input.length) possibleFactor += 1;
            counter = 0;
        }
        return Convert.convertListToArray(hcf);
    }



    private static int divideElement(int[] input, int possibleFactor, int holdOne) {
        for (int count = 0; count < input.length; count++) {
            input[count] = input[count] / possibleFactor;
            if (input[count] == 1) holdOne = 1;
        }
        return holdOne;
    }


}