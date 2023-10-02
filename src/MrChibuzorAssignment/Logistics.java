package MrChibuzorAssignment;

import java.util.Scanner;

public class Logistics{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System .in);
        System.out.println("Enter dispatch rider collection rate:");
        int collectionRate = scanner.nextInt();
        int amount = wages(collectionRate);
        System.out.println(amount);



    }


public static int wages(int collectionRate){
        if(collectionRate < 50){
            int totalPay = collectionRate * 160 + 5000;
            return  totalPay;
        } else if (collectionRate < 59) {
            return collectionRate * 200 + 5000;
        } else if (collectionRate >= 60 && collectionRate < 69) {
            return collectionRate * 250 + 5000;
        } else{
            return collectionRate * 500 + 5000;
        }

    }

}