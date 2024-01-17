package MrFemiAssigmnentAndClassAssesment;

import ArrayExecise.Convert;

import java.util.ArrayList;
import java.util.Arrays;

public class OddPlacedElement {
    public static int[] findOddlyPlacedInput(int[] input) {
        int count = 0;
        ArrayList<Integer> oddPlacedValue = new ArrayList<>();
        while (count < input.length) {
            if (count >= 3) {
                oddPlacedValue.add(input[count]);
                count += 2;
            } else {
                count++;
            }
        }
        return Convert.convertListToArray(oddPlacedValue);
    }
}
