package Programiz;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your principal");
        double principal = scanner.nextDouble();
        System.out.println("Enter your time");
        double time = scanner.nextDouble();
        System.out.println("Enter your rate");
        double rate = scanner.nextDouble();
        double interest = simpleInterest(principal,time,rate);
        System.out.println(interest);
    }

    public static double simpleInterest(double principal,double time,double rate){
         return principal * rate * time / 100;
    }
}
