package ArrayExecise;

import java.util.Arrays;
import java.util.Scanner;

public class Distinct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int counter = 0;
        int[] array = new int[10];
        int [] arrayDistinct = new int[10];
        for (int index = 0; index < 10; index++) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            count++;

            for(int indx = 0;indx < count;indx++) {
                if(number != array[counter]) {
                    counter++;
                    arrayDistinct[index] = number;
                }
            }
        }
        System.out.println(Arrays.toString(arrayDistinct));

    }
}

