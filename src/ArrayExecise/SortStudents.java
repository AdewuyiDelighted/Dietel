package ArrayExecise;

import java.util.Arrays;
import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of student");
        int noOfStudent = scanner.nextInt();

        int[] scores = new int[noOfStudent];
        String[] names = new String[noOfStudent];

        int[] sortedScores = new int[noOfStudent];
        String[] sortedNames = new String[noOfStudent];
        int nameIndex = 0;


        for (int index = 0; index < noOfStudent; index++) {
            //System.out.println("Enter name of student " + (index + 1));
            //names[index] = scanner.next();
            System.out.println("Enter the score of student" + (index + 1));
            scores[index] = scanner.nextInt();
        }

        for (int indexs = 0; indexs < scores.length; indexs++) {
            for (int indices = 0; indexs < scores.length; indexs++) {

                int largest = scores[indexs];
                if (scores[indices] < largest) {
                    int temp = scores[indexs];
                    //nameIndex = indices;
                    sortedScores[indexs] = scores[indices];
                    scores[indices] = temp;
                    //sortedNames[indexs] = names[nameIndex];
                }
            }
        }

        System.out.println(Arrays.toString(sortedScores));
        //System.out.println(Arrays.toString(sortedNames));

    }

}

