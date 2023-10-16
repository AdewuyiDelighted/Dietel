package ArrayExecise;

import java.util.Scanner;

public class CombinationsOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int num = 0; num < array.length; num++) {
            System.out.println("Enter number " + (num+1)+" of " + array.length+" numbers");
            array[num] = scanner.nextInt();
        }
        int combination = 0;
        int fatorialTotalNumbers = 1;
        int factorialPickTwo = 1;
        int factorialSubtract = 1;
        int totalNumber = 10;
        int pickTwo = 2;
        int subtract = totalNumber - pickTwo;
        for(int num = totalNumber; num > 0;num--) {
            fatorialTotalNumbers *= num;

            if(num == pickTwo){
                factorialPickTwo *= num;
                pickTwo--;
            }
            if(num == subtract){
                factorialSubtract *= num;
                subtract--;


            }

        }
        int almost_combination = 2 * factorialSubtract;
        combination = fatorialTotalNumbers / almost_combination;
        System.out.println(combination);
    }
}
