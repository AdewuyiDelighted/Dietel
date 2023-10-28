package Chapter6;

import java.util.Scanner;

class SportRecommenderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your temperature today before sport");
        int temperature = scanner.nextInt();
        SportRecommender.sportRecommender(temperature);


    }

}