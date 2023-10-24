package ClassAssessment;

import java.util.ArrayList;
import java.util.Arrays;

public class HCF {
    public static void main(String[] args) {
        System.out.println(HighestCommon(6, 12, 18));
    }

    public static int max(int... numbers) {
        int length = numbers.length;
        int max = numbers[0];
        for (int index = 0; index < length; index++) {
            if (numbers[index] > max) {
                max = numbers[index];
            }
        }
        return max;
    }

    public static ArrayList<Integer> HighestCommon(int... numbers) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;
       // while (numbers[index] != 1) {
        for (int index = 0; index < numbers.length;index++) {
            while (numbers[index] != 1) {
                if (numbers[index] % divisor == 0) {
                    factors.add(divisor);
                   // numbers[index] /= divisor;
                } else {
                    divisor++;
                   // numbers[index] /= divisor;
                }
                numbers[index] /= divisor;
            }
        }
        return factors;
    }
}







