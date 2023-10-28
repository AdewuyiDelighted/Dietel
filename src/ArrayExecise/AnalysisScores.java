package ArrayExecise;

import java.util.Scanner;

public class AnalysisScores {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    }

        public static int analysisScores(int...numb) {
            int count = 0;
            int scores = 0;
            while (scores != -1) {
                System.out.println("Enter student score or enter 0 to quit");
                scores = scanner.nextInt();
                count++;

            }
            return 0;
        }
    }

