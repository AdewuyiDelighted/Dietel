package MrFemiAssigmnentAndClassAssesment;

import java.util.Scanner;

public class FactorialTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        int product = 1;
        int count = 0;
        double divide = 0;
        double add = 1;
        for(int num = 1;num <= number; num++){
            product = product * num;
            divide = (double) 1 /product;
            add +=divide;

        }
        System.out.println(add);

    }
}

