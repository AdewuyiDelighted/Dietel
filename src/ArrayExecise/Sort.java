package ArrayExecise;

import java.util.Arrays;

public class Sort {
    public static int[] ascending(int[] number) {
        for (int index = 0; index < number.length; index++) {
            for (int indices = index + 1; indices < number.length; indices++) {
                int smallest = number[index];
                if (number[indices] < smallest) {
                    int temp = number[index];
                    number[index] = number[indices];
                    number[indices] = temp;
                }
            }
        }
        return number;
    }

    public static int[] descending(int[] number) {
        for (int index = 0; index < number.length; index++) {
            for (int indices = 0; indices < number.length; indices++) {
                int smallest = number[index];
                if (number[indices] < smallest) {
                    int temp = number[index];
                    number[index] = number[indices];
                    number[indices] = temp;
                }
            }
        }
        return number;
    }


}