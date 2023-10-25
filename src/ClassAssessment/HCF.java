package ClassAssessment;

import MrFemiAssigmnentAndClassAssesment.DominantNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class HCF {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(highestCommonFactor(30,75)));
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

    public static ArrayList<Integer> maxPrimeFactors(int... numbers) {
        int length = max(numbers);
        int index = 2;
        ArrayList<Integer> primeFactors = new ArrayList<>();
        while (length != 1) {
            if (length % index == 0) {
                primeFactors.add(index);
                length /= index;
            } else {
                index++;
            }
        }

        return primeFactors;

    }

    public static int [] highestCommonFactor(int... numbers) {
        ArrayList<Integer> maxPrimeNumbers = maxPrimeFactors(numbers);
        ArrayList<Integer> hcf = new ArrayList<>();
        int count = 0;

        for (int index = 0; index < maxPrimeNumbers.size(); index++) {
            int divisor = maxPrimeNumbers.get(index);

            for (int indexs = 0; indexs < numbers.length; indexs++) {
                if (numbers[indexs] % divisor == 0) {
                    numbers[indexs] /= divisor;
                    count++;
                }

            }
            if (count == numbers.length) {
                hcf.add(maxPrimeNumbers.get(index));
            }
                count = 0;

        }
        return DominantNumber.convertListToArray(hcf);
    }
}







