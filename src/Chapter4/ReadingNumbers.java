package Chapter4;

import java.util.Scanner;

public class ReadingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your initial balance: ");
        int number = scanner.nextInt();
        int counter = 0;
        while(number >= 0) {
            System.out.println("Enter any number:");
            int numb = scanner.nextInt();
            counter += numb;
            if (counter >= number) {
                System.out.println("True"); break;
            }

            }
        }

        }



