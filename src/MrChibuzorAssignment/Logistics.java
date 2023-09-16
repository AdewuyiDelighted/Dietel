package MrChibuzorAssignment;

public class Logistics{
    public static void main(String[] args){
        //wages();

    }


public static int wages(int collectionRate){
        if(collectionRate < 50){
            int totalPay = collectionRate * 160 + 5000;
            return  totalPay;
        } else if (collectionRate >= 50 && collectionRate < 59) {
            int totalPay = collectionRate * 200 + 5000;
            return  totalPay;
        } else if (collectionRate >= 60 && collectionRate < 69) {
            int totalPay = collectionRate * 250 + 5000;
            return  totalPay;
        } else{
            int totalPay = collectionRate * 500 + 5000;
            return  totalPay;
        }

    }

}