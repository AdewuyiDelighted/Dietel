package ChapterSix;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SportRecommenderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your temperature today before sport");
        int temperature = scanner.nextInt();
        SportRecommender.sportRecommender(temperature);


    }

}