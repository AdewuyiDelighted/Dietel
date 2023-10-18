package ChapterSix;

import java.util.Scanner;

public class DisplayByFive {
    public static void main(String[] args) {
        System.out.println(divisibleByFive());
    }
    public static boolean divisibleByFive() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        for (int num = 1; num <= 10; num++) {
            System.out.println("Enter number " + num);
            int input = scanner.nextInt();
            if (input % 5 == 0) {
                count++;
            }
            if (count == 10) {
                return true;
            }
        }
        return false;
    }
}
