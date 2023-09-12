package chapter2;
import java.util.Scanner;
public class Population {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the population :");
        long population = scanner.nextLong();
        System.out.print("Enter growth rate :");
        double growthRate = scanner.nextDouble();
        System.out.print("Enter number of years:");
        int year = scanner.nextInt();

        double worldPopulation =  (population*(1 + growthRate /100));
        double finalWorldPopulation =(Math.pow(worldPopulation ,year));
        System.out.print(finalWorldPopulation);


    }
}
