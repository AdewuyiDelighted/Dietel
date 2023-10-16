package ArrayExecise;

import java.util.Scanner;

public class AnalysisScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int scores = 0;
        while(scores != -1){
            System.out.println("Enter student score or enter 0 to quit");
             scores = scanner.nextInt();
             count++;

        }

    }
}
