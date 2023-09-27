package ChapterTwo;
import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int postiveNumber = 0;
        int negativeNumber = 0;
        int zero = 0;
        for (int num = 1; num <= 5; num++) {
            System.out.println("Enter a number : ");
            int number = scanner.nextInt();
            if (number > 0) {
                postiveNumber++;
            } else if (number < 0) {
                negativeNumber++;
            } else {
                zero++;
            }

        }


        System.out.println("The number positive number are " + postiveNumber);
        System.out.println("The number negative number are " + negativeNumber);
        System.out.println("The number zeros " + zero);

    }
}

































        //        int zero = 0;
//        int positiveNumber = 0;
//        int negativeNumber = 0;
//        System.out.println("Enter first number ");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Enter second number ");
//        int secondNumber = scanner.nextInt();
//        System.out.println("Enter third number ");
//        int thirdNumber = scanner.nextInt();
//        System.out.println("Enter fourth number ");
//        int fourthNumber = scanner.nextInt();
//        System.out.println("Enter fifth number ");
//        int fifthNumber = scanner.nextInt();
//
//        if(firstNumber == 0) {
//            zero = zero + 1;
//        }
//        if(secondNumber == 0) {
//            zero = zero + 1;
//        }
//        if(thirdNumber == 0) {
//            zero = zero + 1;
//        }
//        if(fourthNumber == 0) {
//            zero = zero + 1;
//        }
//        if(fifthNumber == 0) {
//            zero = zero + 1;
//        }
//
//        if(firstNumber > 0){
//            positiveNumber = positiveNumber  + 1;
//        }
//        if(secondNumber > 0){
//            positiveNumber = positiveNumber  + 1;
//        }
//        if(thirdNumber > 0){
//            positiveNumber = positiveNumber  + 1;
//        }
//        if(fourthNumber > 0){
//            positiveNumber = positiveNumber  + 1;
//        }
//        if(fifthNumber > 0){
//            positiveNumber = positiveNumber  + 1;
//        }
//
//
//        if(firstNumber < 0){
//            negativeNumber = negativeNumber  + 1;
//        }
//        if(secondNumber < 0){
//            negativeNumber = negativeNumber  + 1;
//        }
//        if(thirdNumber < 0){
//            negativeNumber = negativeNumber  + 1;
//        }
//        if(fourthNumber < 0){
//            negativeNumber = negativeNumber  + 1;
//        }
//        if(fifthNumber < 0){
//            negativeNumber = negativeNumber  + 1;
//        }
//        System.out.println(zero);
//        System.out.println(positiveNumber);
//        System.out.println(negativeNumber);
//




