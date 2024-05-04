package MrChibuzorAssignment;

import java.util.Arrays;

public class EvenToZeroOddToOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenToZeroOddToOnes(new int[]{4, 5, 8, 8, 8, 2, 9})));
    }

    public static int[] evenToZeroOddToOne(int[] input) {
        for (int index = 0; index < input.length; index++) {
            if (input[index] % 2 == 0) {
                input[index] = 0;
            } else {
                input[index] = 1;
            }
        }
        return input;
    }
public static boolean[] evenToFalseOddToTrue(int[] input) {
        boolean[] convertToBoolean = new boolean[input.length];
        for (int index = 0; index < input.length; index++) {
            if (input[index] % 2 == 0) {
                convertToBoolean[index] = false;
            } else {
                convertToBoolean[index] = true;
            }
        }
        return convertToBoolean;
    }

    public static int[] evenToZeroOddToOnes(int[] input) {
        return Arrays.stream(input)
                .map(EvenToZeroOddToOne::convertToOneOrZero)
                .toArray();

    }
    public static Object[] evenToFalseOddToTrues(int[] input) {
        return Arrays.stream(input)
                .mapToObj((inputs)->convertToFalseOrTrue(inputs))
                .toArray();
    }

    public static int convertToOneOrZero(int input) {
        if (input % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static boolean convertToFalseOrTrue(int input) {
        return input % 2 != 0;
    }
}
