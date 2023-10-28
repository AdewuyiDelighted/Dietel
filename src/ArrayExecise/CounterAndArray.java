package ArrayExecise;

import java.util.Arrays;
import java.util.Scanner;

public class CounterAndArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scanner.nextInt();
        int count = 1;
        int [] array = new int [count];
        array[0] = number;


        for(int index = 1;index <= 9;index++){
            System.out.println("Enter a number");
            number = scanner.nextInt();
            if(number != array[count]) {
                count++;
                array[count] = number;

            }
            System.out.println(Arrays.toString(array));

        }
    }


}
