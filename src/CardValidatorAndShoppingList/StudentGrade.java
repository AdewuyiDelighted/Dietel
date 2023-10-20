package CardValidatorAndShoppingList;

import java.util.Scanner;

public class StudentGrade {
    static Scanner scanner = new Scanner(System.in);
    static int numberOfStudents = 0;
    static int numberOfSubjects = 0;

    public static void main(String[] args) {
        // System.out.println(Arrays.deepToString(enterScore()));
        //  printScores();
        //subjectSummary();

    }


    public static void number0fStudentsAndSubjects() {
        System.out.println("How many students are in your class");
        numberOfStudents = scanner.nextInt();
        System.out.println("How many subject are each student taking");
        numberOfSubjects = scanner.nextInt();
        System.out.println("""
                Saving  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                Saved successfully""");

    }

    public static int[][] enterScore() {

        number0fStudentsAndSubjects();
        int[][] scores = new int[numberOfStudents][numberOfSubjects];
        int[] numOfStudents = new int[numberOfStudents];
        int[] numOfSubjects = new int[numberOfSubjects];
        int[] total = new int[numberOfSubjects];
        for (int students = 0; students < numOfStudents.length; students++) {
            for (int subjects = 0; subjects < numOfSubjects.length; subjects++) {
                System.out.printf("""
                        Entering score for student %d
                        Entering score for subject %d
                        """, students + 1, subjects + 1);
                scores[students][subjects] = scanner.nextInt();
                System.out.println("""
                        Saving  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                        Saved successfully""");
            }
        }
        return scores;
    }

    public static void printScores() {
        int sum = 0;
        int total = 0;
        double average = 0.0;
        int count = 0;
        int[][] newScores = enterScore();
        System.out.print("STUDENTS");
        for (int num = 0; num < numberOfSubjects; num++) {
            System.out.printf("%10s%d", "SUB", (num + 1));
        }
        System.out.printf("%10s%10s%10s%n", "TOT", "AVE", "POS");
        for (int student = 0; student < newScores.length; student++) {
            System.out.printf("%s%d", "STUDENT", (student + 1));
            for (int subject = 0; subject < newScores[student].length; subject++) {
                total = newScores[student][subject];
                sum += total;
                count++;
                System.out.printf("%11d", newScores[student][subject]);
            }
            average = (double) sum / newScores[student].length;
            System.out.printf("%11d", sum);
            System.out.printf("%11.2f", average);
            System.out.println();
            sum = 0;
            // average = 0;
        }
    }


}
