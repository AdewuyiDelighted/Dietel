package ClassAssessment;

import java.util.Arrays;

public class Shuffling {
    public static void main(String[] args) {
        int [] array = {42,15,18,12,13};
        System.out.println(Arrays.toString(shuffleNumber(array)));
    }
    public static int[] shuffle(int[] array) {
        int length = array.length;
        int[] newArray = new int[array.length];
        if (length % 2 == 0) {
            newArray = even(newArray, array);

        }
        if (length % 2 != 0) {
            newArray = odd(newArray, array);
        }
        return newArray;
    }

    public static int[] shuffleMiddleTwo(int [] array) {
        int[] newArray = new int[array.length];
        if(array.length % 2 == 0) {
            newArray = shuffleMiddleElementEven(array);

        }
        if(array.length % 2 != 0){
            newArray = shuffleMiddleElementOdd(array);
        }
        return newArray;
    }


    private static int[] even(int[] newArray, int[] array) {
        int count = 0;
        for (int index = 0; index < array.length; index += 2) {
            count = index;
            newArray[index] = array[count + 1];
            newArray[index + 1] = array[count];
        }
        return newArray;
    }

    private static int[] odd(int[] newArray, int[] array) {
        int count = 0;
        newArray[array.length - 1] = array[array.length - 1];
        for (int index = 0; index < array.length - 1; index += 2) {
            count = index;
            newArray[index] = array[count + 1];
            newArray[index + 1] = array[count];
        }
        return newArray;
    }
    private static int[] shuffleMiddleElementEven(int[] array) {
        int firstOne = array.length /2;
        int secondOne = firstOne - 1;
        int temp = array[firstOne];
        array[firstOne] = array[secondOne];
        array[secondOne] = temp;
        return array;
    }
    private static int[] shuffleMiddleElementOdd(int[] array) {
        int firstOne = array.length /2;
        int secondOne = firstOne + 1;
        int temp = array[firstOne];
        array[firstOne] = array[secondOne];
        array[secondOne] = temp;
        return array;
    }

// refactoring
    public static int[] shuffleNumber(int[] numbers){
        int countForEvenPosition = 0;
        for(int countForOddPosition = 1; countForOddPosition < numbers.length;countForOddPosition+=2){
            int temp = numbers[countForEvenPosition];
            numbers[countForEvenPosition] = numbers[countForOddPosition];
            numbers[countForOddPosition] = temp;
            countForEvenPosition+=2;
        }
        return numbers;
    }



}
