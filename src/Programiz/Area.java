package Programiz;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius");
        double radius = scanner.nextDouble();
        double pie = 3.14;
        System.out.println(area(pie,radius));
    }

    public static double area(double pi,double radius) {
        return 3.14 * radius * radius;
    }
}
