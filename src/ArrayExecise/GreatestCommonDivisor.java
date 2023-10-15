package ArrayExecise;

import java.util.ArrayList

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(max(8, 4, 3, 2, 1));
        System.out.println(factorsOfIndex(8, 4, 3, 2, 1));

    }


    public static int max(int... numbers) {
        int max = numbers[0];
        for (int num = 0; num < numbers.length; num++) {
            if (numbers[num] > max) {
                max = numbers[num];
            }

        }
        return max;
    }

    public static ArrayList<Integer> factorsOfIndex(int... numbers) {
        int maxOfNumbers = max(numbers);
        ArrayList<Integer> factorsOfAllIndexes = new ArrayList<>();
        for (int numb = 0; numb < numbers.length; numb++) {
            for (int num = 1; num <= maxOfNumbers; num++) {
                if (numbers[numb] % num == 0) {
                    factorsOfAllIndexes.add(num);

                }
            }
        }
        return factorsOfAllIndexes;
    }

    }






