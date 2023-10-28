package Chapter5;

import java.util.Scanner;

public class GlobalWarming {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        globalWarming();
    }

    public static String globalWarming() {
        int right = 0;
        String returnMessage = "1";
        System.out.println("Enter an option between 1 - 4");
        System.out.println("""
                Question 1. Which one of thr following causes global warming
                1.Carbon dioxide
                2.Oxygen
                3.Nitrogen
                4.Hydrogen""");
        int answerOne = scanner.nextInt();
        int correctAnswerOne = 1;
        if (answerOne == correctAnswerOne) {
            right++;
        }
        System.out.println("""
                Question 2.  Who measures the global warning rate
                1.Astrologers
                2.Physicist
                3.Philosoper
                4.Climatologist""");
        int answerTwo = scanner.nextInt();
        int correctAnswerTwo = 4;
        if (answerTwo == correctAnswerTwo) {
            right++;
        }
        System.out.println("""
                Question 3. Which of the following result takes places due to global warming
                1.Maintaining Steady temperature
                2.Change in the rainfall
                3.Pleasant environment
                4.Causing less pollution""");
        int answerThree = scanner.nextInt();
        int correctAnswerThree = 2;
        if (answerThree == correctAnswerThree) {
            right++;
        }
        System.out.println("""
                Question 4.  Which of the following activities cause global warming
                1.Radiative forcing
                2.Earth gravitation force
                3.Oxygen
                4.Centripetal force""");
        int answerFour = scanner.nextInt();
        int correctAnswerFour = 1;
        if (answerFour == correctAnswerFour) {
            right++;
        }
        if (right == 4) return "Very Good";
        else if (right == 3) return "Good";

        else if (right == 2) return "Fair";

        else if (right == 1) return "Try again";

        return returnMessage;


    }
}






