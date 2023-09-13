package ChapterFour;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne;
        int numberTwo ;

    for(int num = 1;num < 2;num++){
        System.out.println("Enter a number : ");
         numberOne = scanner.nextInt();
         System.out.println("Enter a number: ");
        numberTwo = scanner.nextInt();
        if(numberOne == numberTwo){
        System.out.println("0");
    }
    else if (numberOne > numberTwo){
        System.out.println("1");
    }
    else{
        System.out.println("-1");
    }
    }

    }
}
