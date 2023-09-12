package ChapterFour;


import java.util.Scanner;

public class TwoHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int number = 0;
        int highestOne = number;
        int highestTwo = number;
        int count = 0;
        for(int numb = 1;numb <=10;numb++) {
            System.out.println("Enter number :");
            number = scanner.nextInt();
            if (highestOne < number) {
                highestOne = number;

            }
        }
        System.out.println(highestOne);
        System.out.println(count);
    }
}
