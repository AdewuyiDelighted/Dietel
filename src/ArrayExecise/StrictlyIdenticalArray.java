package ArrayExecise;

import java.util.Scanner;

public class StrictlyIdenticalArray {
    public static void main(String[] args) {
        int[] list = new int [6];
        int[] listTwo = new int [6];

        Scanner scanner = new Scanner(System.in);

        for(int index = 0; index < list.length;index++){
            System.out.println("Enter the element of first list(6 elements) element " + (index +1));
            list[index] = scanner.nextInt();

        }

        for(int index = 0; index < listTwo.length;index++){
            System.out.println("Enter the element of second list(6 elements) element " + (index + 1));
            listTwo[index] = scanner.nextInt();
        }
        boolean result = equals(list,listTwo);
        if(result){
            System.out.println("Two list are identical");
        }
        else {
            System.out.println("The two lists are not identical");
        }


    }

    public static boolean equals(int[] firstArray, int[] secondArray) {
        boolean result = false;
        int occurance = 0;
        for (int arrayCount = 0; arrayCount < secondArray.length; arrayCount++) {
            if (firstArray[arrayCount] == secondArray[arrayCount]) {
                occurance++;
            }
        }

        if (occurance == secondArray.length) {
            result = true;
        }
        return result;
    }

}

