package ArrayExecise;

import java.util.Arrays;

public class PrimeNumbersArray {
    public static void main(String[] args) {
        int [] primeArray = new int[50];

        final int NUMBER_OF_PRIME_NUMBER = 50;
        final int NUMBER_OF_LINES = 10;

        int count = 0;
        int number = 2;
        int index = 0;


        while (count < NUMBER_OF_PRIME_NUMBER) {
            boolean isPrime = true;

            double squareRoot = Math.sqrt(number);
            String strSquareRoot = String.format("%.2f",squareRoot);
            double convertedSquareRoot = Double.parseDouble(strSquareRoot);

            if (convertedSquareRoot == number && convertedSquareRoot < number) {
                    if(convertedSquareRoot % number == 0){
                        isPrime = false;
                    }

            }

            if (isPrime) {
                count++;
                primeArray[index] = number;
                index++;
            }
            number++;
        }

        System.out.println(Arrays.toString(primeArray));


    }
}
