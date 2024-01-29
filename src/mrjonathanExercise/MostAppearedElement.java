package mrjonathanExercise;

import java.lang.reflect.Array;
import java.util.Collections;

public class MostAppearedElement {
    public static int mostAppearedElement(int[] input) {
        int countAppearance = 0;
        int formerCounter = 0;
        int counter = 0;
        for (int index = 0; index < input.length; index++) {
            counter = secondLoop(input, index, counter);
            if (counter > formerCounter) formerCounter = counter;
            countAppearance = input[index];
        }
        return countAppearance;

    }


    private static int secondLoop(int[] input, int index, int counter) {
        for (int count = 0; count < input.length; count++) {
            if (input[index] == input[count]) {
                counter++;
            }
        }
        return counter;
    }
}
