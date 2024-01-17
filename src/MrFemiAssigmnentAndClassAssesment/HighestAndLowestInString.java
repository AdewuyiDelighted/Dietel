package MrFemiAssigmnentAndClassAssesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HighestAndLowestInString {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findHighestAndLowest("1 2 3 4 -5")));
    }


    public static int[] findHighestAndLowest(String input) {
        int indexs = 0;
        ArrayList<Integer> numberOfInput = new ArrayList<>();
        int[] highestAndLowestElement = new int[2];
        int numberInString = 0;
        for (int index = 0; index < input.length(); index++) {
            String number = String.valueOf(input.charAt(index));
            if (number.equals("-")) {
                numberInString = Integer.parseInt("-" + String.valueOf(input.charAt(index + 1)));
                indexs = index+1;
                numberOfInput.add(numberInString);
                String numbers = String.valueOf(input.charAt(index + 1));
            } else if (!number.equals(" ")) {
                if(index == indexs) continue;
                numberInString = Integer.parseInt(number);
                numberOfInput.add(numberInString);
            }
        }
        return highestAndLowestElement(numberOfInput, highestAndLowestElement);

    }


    private static int[] highestAndLowestElement(ArrayList<Integer> numberOfInput, int[] highestAndLowestElement) {
        for (int count = 0; count < numberOfInput.size(); count++) {
            highestAndLowestElement[0] = Collections.max(numberOfInput);
            highestAndLowestElement[1] = Collections.min(numberOfInput);
        }
        return highestAndLowestElement;

    }
}

