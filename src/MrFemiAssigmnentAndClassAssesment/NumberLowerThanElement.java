package MrFemiAssigmnentAndClassAssesment;

import java.util.Arrays;

public class NumberLowerThanElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(checkLowerNumber(new int[]{1, 3, 2, 7})));
    }

    public static int[] checkLowerNumber(int[] input) {
        int counter = 0;
        int[] holdNumberOfLowerValue = new int[input.length];
        for (int index = 0; index < input.length; index++) {
            for (int count = 0; count < input.length; count++) {
                if (input[count] < input[index]) {
                    counter++;
                }
            }
            holdNumberOfLowerValue[index] = counter;
            counter = 0;
        }
        return holdNumberOfLowerValue;
    }
}
