package ArrayExecise;

import java.util.Scanner;

public class IndexOfSmallestElement {
    public static void main(String[] args) {
        int min = 0;
        double [] element = new double[10];
        for(int num = 0; num < 10;num++ ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            element[num] = scanner.nextDouble();
        }
        min = indexOfSmallestElement(element);
        System.out.println(min);
    }


    public static int indexOfSmallestElement(double[] numbers) {
        double min = numbers[0];
        int indexes = 0;
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] < min) {
                min = numbers[index];
                 indexes = index;
            }

        }
        return indexes;
    }
}
