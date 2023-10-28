package Chapter4;

import java.util.Scanner;

public class ValidatingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passes = 0;
        int failure = 0;
        int studentCounter = 1;
        int count = 0;
        int score = 0;

        while (studentCounter <= 10) {
           System.out.println("Enter your grade(1= pass , 2 = fail)");
             score = scanner.nextInt();
             if(score  == 1) {
                passes++;
            }
            else if (score == 2){
                failure++;
            }
           else{
               System.out.println("Enter your valid grade(1= pass , 2 = fail)");
               score = scanner.nextInt();
           }
            studentCounter++;

        }
        System.out.println(passes);
        System.out.println(failure);
        System.out.println(score);
        }
    }
