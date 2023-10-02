import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digit number :");
        int number = scanner.nextInt();
        int total = number;
        int count = 0;
         int convert = 0;
         if(number < 10000) {
             System.out.println("Invalid number " + " Enter a valid number");
             number = scanner.nextInt();
         }
         if (number >= 10000 && number < 99999) {
                 while (number != 0) {
                     count = number % 10;
                     convert = convert * 10 + count;
                     number /= 10;


                 }
             }


         if (total == convert){
        System.out.println("palindrome");
    }

    }
}
