package CardValidatorAndShoppingList;

import java.util.Scanner;

public class StudentGrade {
    static Scanner scanner = new Scanner(System.in);
    static int numberOfStudents = 0;
    static int numberOfSubjects = 0;

    public static void main(String[] args) {
        printAll();

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

    public static void printScores(int [] [] enterScore) {
        int sum = 0;
        int total = 0;
        double average = 0.0;
        int count = 0;

        System.out.print("STUDENTS");

            for(int num = 0; num < enterScore[0].length; num++){
            System.out.printf("%10s%d", "SUB", (num + 1));
        }
        System.out.printf("%10s%10s%10s%n", "TOT", "AVE", "POS");

          for(int student = 0; student < enterScore.length; student++){
            System.out.printf("%s%d", "STUDENT", (student + 1));
            for (int subject = 0; subject < enterScore[student].length; subject++) {
                total = enterScore[student][subject];
                sum += total;
                count++;
                System.out.printf("%11d",enterScore[student][subject]);
            }
            average = (double) sum / enterScore[student].length;
            System.out.printf("%11d", sum);
            System.out.printf("%11.2f", average);
            System.out.println();
            sum = 0;
        }
    }

    public static void subjectSummary(int [] [] enterScore) {

        int max = enterScore[0][0];
        int min = enterScore[0][0];
        int maxIndex = 1;
            int minIndex = 1;
        int sum = 0;
        int passCount = 0;
        int failCount = 0;
        double average = 0.0;
        System.out.println("SUBJECT SUMMARY");
        for (int subject = 0; subject < enterScore[0].length; subject++) {
             max = enterScore[0][subject];
             min = enterScore[0][subject];
            for (int student = 0; student < enterScore.length; student++) {

                sum += enterScore[student][subject];
                average = (double) sum / enterScore.length;


                if (enterScore[student][subject] > max) {
                    max = enterScore[student][subject];
                }
                    maxIndex += student;

                if (enterScore[student][subject] < min) {
                    min = enterScore[student][subject];
                    minIndex += student ;
                }
                if (enterScore[student][subject] >= 50) {
                    passCount++;
                } else {
                    failCount++;

                }

            }

            System.out.printf("""
                    Subject %d
                    Highest scoring student is : Student %d scoring %d
                    Lowest Scoring student is : Student %d scoring %d
                    Total Score is: %d
                    Average score is : %.2f
                    Number of passes : %d
                    Number of fail: %d %n""", (subject + 1), maxIndex, max, minIndex, min, sum, average, passCount, failCount);

            maxIndex = 1;
            minIndex = 1;
            sum = 0;
            passCount = 0;
            failCount = 0;
        }

    }

public static void printAll(){
      int [] [] scores = enterScore();
      printScores(scores);
      subjectSummary(scores);
}
}



