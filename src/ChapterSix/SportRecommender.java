package ChapterSix;

import java.util.Scanner;

public class SportRecommender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your temperature today before sport");
        int temperature = scanner.nextInt();
        sportRecommender(temperature);
    }

    public static void sportRecommender(int celsiusTemperature) {
        if (celsiusTemperature >= 20 && celsiusTemperature < 30) {
            System.out.println("Its lovely weather for sport");
        } else if (celsiusTemperature >= 30 && celsiusTemperature < 40) {
            System.out.println("Please exercise with care today,watch out for the weather");
        } else {
            System.out.println("invalid input");
        }
    }

}


