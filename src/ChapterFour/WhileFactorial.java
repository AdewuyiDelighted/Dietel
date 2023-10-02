package ChapterFour;

import java.util.Scanner;

public class WhileFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int num = 1;
        int total = 1;
        while(num <= number){
            total = total * num;
            num++;
        }
        System.out.println(total);
    }
}















        //        for( num =1;num <=numb;num++){
//           total = total*num;
//        }
//        System.out.println(total);
//    }
//}