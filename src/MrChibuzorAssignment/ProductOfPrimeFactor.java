package MrChibuzorAssignment;

import java.util.Arrays;

public class ProductOfPrimeFactor {
    public static void main(String[] args) {
        System.out.println(primeFactors(30));
    }


    public static int[] product(int number) {
        int count = 0;
        int[] array = new int[2];
        int factorOne = 0;
        int factorTwo = 0;
        for (int index = 1; index < number; index++) {
            for (int indices = 1; indices < number; indices++) {
                if (index * indices == number) {
                    factorOne = index;
                    factorTwo = indices;
                }

            }

        }
        array[count] = factorOne;
        count++;
        array[count] = factorTwo;
        return array;

    }
    public static String primeFactors(int input) {
        int [] number = product(input);
        int max = 0;
        int factorOne = number[0];
        int factorTwo = number[1];
        String primeFactors = "";
        if (factorOne > factorTwo) max = factorOne;
        primeFactors += factorTwo + "";
          while(max != 1){
            if (max % 2 == 0) {
                primeFactors += 2;
            } else {
                primeFactors += max;
            }
            max /= 2;

        }
        return primeFactors;
    }

//    public static int[] productOfPrimeNumber(String input){
//        int [] array = new int [input.length()];
//        for(int index = 0;index < array.length;index++){
//
//        }
//
//   // }
}









