package mrjonathanExercise;

import java.util.ArrayList;
import java.util.Collections;

public class LowestCommonElement {

    public static int findTheLowestElement(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> commonElements = new ArrayList<>();
        for (int index = 0; index < firstArray.length; index++) {
            for (int count = 0; count < secondArray.length; count++) {
                if (firstArray[index] == secondArray[count]) {
                    commonElements.add(firstArray[index]);
                }
            }
        }
        return smallestElement(commonElements);
    }

    private static int smallestElement(ArrayList<Integer> commonElements) {
        int smallest = commonElements.get(0);
        for (int index = 0; index < commonElements.size(); index++) {
            if (commonElements.get(index) < smallest) smallest = commonElements.get(index);
        }
        return smallest;
    }
}
