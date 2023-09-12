import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or 0 to quit");
        int input = scanner.nextInt();
        int counter = 0;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(;input != 0;){
            System.out.println("Enter a number or 0 to quit");
            input = scanner.nextInt();
            counter++;

        }
            if (counter < 0)
                negative++;


            if (counter > 0)
                positive++;


            if (counter == 0)
                zero++;


            System.out.println(positive);
            System.out.println(negative);
            System.out.println(zero);
        }
    }
