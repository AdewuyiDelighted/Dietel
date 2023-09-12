package Chapter3;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class HealthProfileTest {
    public static void main(String [] args){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter gender: ");
            String gender = scanner.nextLine();
            System.out.print("Enter date of Birth: ");
            int date = scanner.nextInt();
            System.out.print("Enter month of birth:");
            int month = scanner.nextInt();
            System.out.print("Enter year of Birth: ");
            int year = scanner.nextInt();
            System.out.print("Enter Height: ");
            double height = scanner.nextDouble();
            System.out.print("Enter weight: ");
            double weight = scanner.nextDouble();


            HealthProfile health = new HealthProfile("Lawal", "Seun", "male", 17, 04, 2000, 6.5, 50.5);


            health.setFirstName(firstName);
            health.setLastName(lastName);
            health.setGender(gender);
            health.setDayOfBirth(date);
            health.setMonthOfBirth(month);
            health.setYearOfBirth(year);
            health.setHeight(height);
            health.setWeight(weight);

            System.out.println(" ");
            System.out.println("First name : "+ health.getFirstName());
            System.out.println("Last Name : " + health.getLastName());
            System.out.println("Gender: " + health.getGender());
            System.out.println("Date Of Birth :" + health.getDayOfBirth()+"/"+health.getMonthOfBirth()+ "/"+health.getYearOfBirth());
            System.out.println("Height: " + health.getHeight());
            System.out.println("Weight : " + health.getWeight());
            System.out.println("Age : " + health.getAge());
            System.out.println("Body Mass Index :" + health.getBodyMassIndex());
            System.out.println("Maximum Heart Rate :" + health.getMaximumHeartRate());
            System.out.println("Target Heart Rate: " + health.getTargetedHeartRateOne() + " to " + health.getTargetedHeartRateTwo());
        }

}