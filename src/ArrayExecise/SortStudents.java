package ArrayExecise;

import java.util.Arrays;
import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of student");
        int noOfStudent = scanner.nextInt();

        int [] studentScores = new int[noOfStudent];
        String [] studentNames = new String [noOfStudent];

        for(int index = 0; index < noOfStudent;index++){
            System.out.println("Enter name of student "+(index+1));
            studentNames[index] = scanner.next();
            System.out.println("Enter score of student "+(index+1));
            studentScores[index] = scanner.nextInt();
        }

        for(int indices = 0; indices < studentScores.length; indices++){
            for(int count = indices +1; count < studentScores.length; count++){
                int maxi = studentScores[indices];

                if(studentScores[count] > maxi){
                    int temp = studentScores[indices];
                    String tempNames = studentNames[indices];

                    studentNames[indices] = studentNames[count];
                    studentScores[indices] = studentScores[count];
                    studentScores[count] = temp;
                    studentNames[count] = tempNames;


                }

            }
        }
        System.out.println(Arrays.toString(studentScores));
        System.out.println(Arrays.toString(studentNames));

    }

}

