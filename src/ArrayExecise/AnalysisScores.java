package ArrayExecise;

import java.util.ArrayList;
import java.util.Scanner;

public class AnalysisScores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> unspecifiedNumOfScore = new ArrayList<>();
        int aboveAverage = 0;
        int belowAverage = 0;
        int equalsAverage = 0;
        int average = 50;

        int count = 0;
        int stopper = 0;
        while (stopper != -1) {
            System.out.println("Enter student " + (count +1)+ " score");
           int scores = scanner.nextInt();
            count++;

            if(scores > average){
                aboveAverage++;
            }
            else if (scores < average) {
                belowAverage++;
            }

            else if(scores == average){
                equalsAverage++;
            }
            System.out.println("-1 to stop or 0 to continue");
            stopper = scanner.nextInt();

        }
        System.out.println("The total number of score above average is :" + aboveAverage);
        System.out.println("The total number of score below average is: " + belowAverage);
        System.out.println("Tne total number of scores equals to average: " +equalsAverage);

        }

    }



