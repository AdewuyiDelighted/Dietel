package Chapter3;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class HeartRatesTest {
    public static void main (String [] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First Name:");
        String firstName = scanner.nextLine();
        System.out.print("Enter your Last Name:");
        String lastName = scanner.nextLine();
        System.out.print("Enter date of birth:");
        int date = scanner.nextInt();
        System.out.print("Enter month of birth:");
        int month = scanner.nextInt();
        System.out.print("Enter year of birth:");
        int year = scanner.nextInt();




        HeartRates heart = new HeartRates("Bolu" ,"Tayo" , 8 ,24,2002);

        heart.setFirstName(firstName);
        heart.setLastName(lastName);
        heart.setDayOfBirth(date);
        heart.setMonthOfBirth(month);
        heart.setYearOfBirth(year);
        //heart.setAge(2002,2023);
        //heart.setMaximumHeartRate(2002,2023);

        System.out.println(" ");
        System.out.println("FirstName : " + heart.getFirstName());
        System.out.println("LastName : " + heart.getLastName());
        System.out.println("Date of birth :" + heart.getDayOfBirth() +"/" + heart.getMonthOfBirth()+ "/"+heart.getYearOfBirth());
        //System.out.println(heart.getMonthOfBirth());
        //System.out.println(heart.getYearOfBirth());
        System.out.println("Age: " + heart.getAge());
        System.out.println("Maximum Heart Rate : " + heart.getMaximumHeartRate());
        System.out.println("Targeted Heart Rate : " + heart.getTargetHeartRateOne() + " to " + heart.getTargetHeartRateTwo());
        //System.out.println(heart.getTargetHeartRateTwo());

    }




}