package StudentPackage;

import StudentPackage.Student;

import java.util.Scanner;

public class StudentMainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                 WELCOME TO A NEW ACADEMIC SESSION
                 In order to know the department and level you belong
                 read and follow the process below
                """);
        System.out.println("""
                  Select a letter and a number in the option below
                  M : Mathematics
                  C : Computer science
                  I : Information Technology
                  select a number
                  1 : Freshman
                  2 : Sophomore
                  3 : junior
                  4 : Senior
                  Enter the two character you selected
                """);
        String status = scanner.nextLine();
        String result = Student.major(status);
        System.out.println(result);

           }


           }




