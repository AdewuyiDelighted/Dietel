package mrjonathanExercise;

import java.util.Arrays;

public class AdditionOfTwoElement {
    private static int[] newArray = new int[0];

    public static int[] addTwoElements(int[] arr) {
        int count = 0;
        if (arr.length % 2 == 0) {
            newArray = evenLength(arr, count);
        } else {
            newArray = oddLength(arr, count);
        }
        return newArray;
    }
    private static int[] evenLength(int[] arr, int count) {
        newArray = new int[arr.length / 2];
        for (int index = 0; index < arr.length; index += 2) {
            newArray[count] = arr[index] + arr[index + 1];
            count++;
        }
        return newArray;
    }

    private static int[] oddLength(int[] arr, int count) {
        newArray = new int[arr.length / 2 + 1];
        for (int index = 0;index < arr.length - 1; index += 2) {
            newArray[count] = arr[index] + arr[index + 1];
            count++;
        }
        newArray[newArray.length - 1] = arr[arr.length - 1];
        return newArray;
    }
}
