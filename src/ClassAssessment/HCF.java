package ClassAssessment;

import MrFemiAssigmnentAndClassAssesment.DominantNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class HCF {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(highestCommonFactor(420,1782)));
    }


    public static int maximum(int... numbers) {
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
        int maximum = maximum(numbers);
        int divisor = 2;
        ArrayList<Integer> primeFactors = new ArrayList<>();
        while (maximum != 1) {
            if (maximum % divisor == 0) {
                primeFactors.add(divisor);
                maximum /= divisor;
            } else {
                divisor++;
            }
        }

        return primeFactors;

    }

    public static int [] highestCommonFactor(int... numbers) {
        ArrayList<Integer> maxPrimeNumbers = maxPrimeFactors(numbers);
        ArrayList<Integer> hcf = new ArrayList<>();
        int numberOfDivide = 0;
        int divisor = 0;

        for (int index = 0; index < maxPrimeNumbers.size(); index++) {
            divisor = maxPrimeNumbers.get(index);
            for (int indexs = 0; indexs < numbers.length; indexs++) {
                if (numbers[indexs] % divisor == 0) {
                    numbers[indexs] /= divisor;
                    numberOfDivide++;
                }
            }
            if (numberOfDivide == numbers.length) {
                hcf.add(divisor);
            }
                numberOfDivide = 0;
        }
        return convertListToArray(hcf);
    }

    public static int[] convertListToArray(ArrayList<Integer> inputs){
        int [] array = new int [inputs.size()];
        for(int index = 0;index < array.length;index++){
            array[index] = inputs.get(index);
        }
        return array;
    }

}







