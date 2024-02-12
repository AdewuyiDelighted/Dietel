package mrjonathanExercise;

import java.util.Arrays;

public class RotateElements {

    public static int[][] rotateElement(int[][] array) {
        int count = 0;
        int innerLength = array[0].length;
        int[][] newArray = new int[array.length][innerLength];
        for (int index = 0; index < array.length; index++) {
            while (count != array[index].length) {
                newArray[index][count] = array[count][index];
                count++;
            }
            count = 0;
        }
        return newArray;
    }
}
