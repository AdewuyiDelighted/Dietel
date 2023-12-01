package ArrayExecise;

import java.util.Arrays;
import java.util.Scanner;

public class HoursOfWork {


    public static int[][] inputWorkHours() {
        Scanner scanner = new Scanner(System.in);
        int[][] workHours = new int[4][7];
        for (int index = 0; index < workHours.length; index++) {
            for (int count = 0; count < workHours[index].length; count++) {
                System.out.println("Enter the number of hours employee " + (index + 1) + " on " + WorkDays.values()[count]);
                int hours = scanner.nextInt();
                workHours[index][count] = hours;
            }
        }
        return workHours;
    }

    public static void workHour() {
        int[][] employeeWorkHours = inputWorkHours();
        System.out.printf("%17s%4s%4s%4s%4s%4s%4s%n", "SU", "M", "T", "W", "Th", "F", "Sa");
        for (int index = 0; index < employeeWorkHours.length; index++) {
            System.out.print("Employee " + (index + 1) + "\t\t");
            for (int count = 0; count < employeeWorkHours[index].length; count++) {
                System.out.print(employeeWorkHours[index][count] + "\t");
            }
            System.out.println(" ");
        }
        orderOfHour(employeeWorkHours);

    }

    public static int[] orderOfEmployeesWorkHours(int[][] workHours) {
        int[] totalHourPerEmployee = new int[workHours.length];
        int sum = 0;
        for (int index = 0; index < workHours.length; index++) {
            for (int count = 0; count < workHours[index].length; count++) {
                sum += workHours[index][count];
            }
            totalHourPerEmployee[index] = sum;
            sum = 0;
        }
        return totalHourPerEmployee;
    }

    public static void orderOfHour(int[][] array) {
        int[] indexOfMini = new int[array.length];
        int[] totalHourPerEmployee = orderOfEmployeesWorkHours(array);
        for (int index = 0; index < totalHourPerEmployee.length; index++) {
            for (int count = index + 1; count < totalHourPerEmployee.length; count++) {
                int miniHour = totalHourPerEmployee[index];
                if (totalHourPerEmployee[count] > miniHour) {
                    int temp = totalHourPerEmployee[index];
                    totalHourPerEmployee[index] = totalHourPerEmployee[count];
                    totalHourPerEmployee[count] = temp;
                    indexOfMini[index] = count + 1;
                }
            }
            System.out.println("Employee " + indexOfMini[index] + " " + totalHourPerEmployee[index]);


        }
    }

}
