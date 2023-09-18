package MrChibuzorAssignment;

import java.io.PrintStream;

public class Function {
    public static void main(String[] args) {


    }

    public static boolean evenNUM(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean primeNumber(int number) {
        int divide = 0;
        int count = 0;
        if (number <= 1)
            return false;

        for (int num = 1; num <= number; num++) {
            divide = number % num;
            if (divide == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }


    public static int subtract(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber - firstNumber;
        } else {
            return firstNumber - secondNumber;
        }

    }

    public static double divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return 0;
        } else {
              double total = (double) firstNumber / secondNumber;
              System.out.printf("%.2f",firstNumber/secondNumber);
            return total;
        }


    }

    public static int factor(int number) {
        int count = 0;
        for (int num = 1; num <= number; num++) {
            int divide = number % num;
            if (divide == 0) {
                count++;
            }

        }
        return (count);
    }


    public static boolean square(int number) {
        int result = 1;
        int count = 0;
        for (int num = 1; num <= number; num++) {
            result = num * num;
            if (result == number) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }


    }

    public static boolean palindrome(int number) {
        int total = number;
        int count = 0;
        int convert = 0;
        if (number >= 10000 && number < 99999) {
            while (number != 0) {
                count = number % 10;
                convert = convert * 10 + count;
                number /= 10;
            }
        } else {
            return false;
        }

        if (total == convert) {
            return true;
        } else {
            return false;
        }
    }

    public static int factorial(int number) {
        int product = 1;
        for(int num = 1; num <= number;num++){
            product = product * num;
        }
    return product;
    }
}