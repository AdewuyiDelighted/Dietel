package ArrayExecise;

import java.util.Arrays;
import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        int count = 0;
        int one = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of student");

        int noOfStudent = scanner.nextInt();
        int[] scores = new int[noOfStudent];
        String[] names = new String[noOfStudent];
        int minimum = 0;

        for (int num = 0; num < noOfStudent; num++) {
            //names[num] = scanner.nextLine();
           // scanner.nextLine();
            System.out.println("Enter the score of student");
            scores[num] = scanner.nextInt();
        }


        for(int num = 0;num < noOfStudent;num++){
            for(int numb = 0;numb < noOfStudent;numb++){
                if(scores[numb] > scores[num]){
                    minimum = scores[numb];
                    scores[num] = scores[numb];
                    scores[numb]  = minimum;
                }
                System.out.println(minimum);
            }
            //System.out.println(Arrays.toString(scores));
        }

    }
}
