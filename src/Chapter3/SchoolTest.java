package Chapter3;

import java.util.Scanner;



public class SchoolTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter name of school:");
        String schoolName = scanner.nextLine();
        System.out.print("Enter school location:");
        String location = scanner.nextLine();
        System.out.print("Enter number of students:");
        int numberOfStudent = scanner.nextInt();

        School school = new School();

        school.setSchoolName(schoolName);
        school.setNumberOfStudent(numberOfStudent);
        school.setLocation(location);


        System.out.println(school.getName());
        System.out.println(school.getLocation());
        System.out.println(school.getNumberOfStudents());






    }


}