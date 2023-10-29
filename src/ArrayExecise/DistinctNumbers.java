package ArrayExecise;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] array = new int[10];
        for(int index = 0; index < 10; index++) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            if(array[index] != number) {
                array[count] = number;
                count++;
            }


        }
        System.out.println(Arrays.toString(array));

    }
}
