package MrFemiAssigmnentAndClassAssesment;

import java.util.Scanner;

public class FactorialThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        double product = 1;
        double power = 0;
        double divide = 0;
        double add = 1;
        for(int num = 1;num <= number;num++){
            product = product * num;
            power = Math.pow(number, num);
            //System.out.println(power);
            divide = power / product;
            add += divide;
        }
        System.out.println("The constant of e is " + add);
    }

}
