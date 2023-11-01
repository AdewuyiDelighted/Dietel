package PersonalAssessement;

import java.util.Arrays;

public class IsPrimeTenEdition {
    public static void main(String[] args) {
        int[] primeNumber = new int[0];
        System.out.println(Arrays.toString(recheckPrimeNumber(primeNumber)));
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        primeNumber = new int[50];
        int count = 0;
        int number = 2;
        int index = 0;
        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;


            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    primeNumber[index] = number;
                } else {
                    primeNumber[index] = number;
                    index++;

                }
            }
            number++;
        }
        System.out.println(Arrays.toString(primeNumber));
    }

    public static int[] recheckPrimeNumber(int[] primeNumber) {
        int[] primeNumbers = new int[primeNumber.length];
        for (int index = 0; index < primeNumbers.length; index++) {
            double squareRoot = Math.sqrt(primeNumber[index]);
            if(squareRoot < primeNumbers[index] || squareRoot == primeNumber[index]) {
                if (squareRoot % primeNumber[index] == 0) {
                    primeNumbers[index] = primeNumber[index];
                }
            }
        }
        return primeNumbers;
    }


}

