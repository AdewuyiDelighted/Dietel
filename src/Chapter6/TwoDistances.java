package Chapter6;

public class TwoDistances {


    public static double distance(int sideOneHorizontal,int sideOneVertical, int sideTwoHorizontal,int sideTwoVertical){
        int horizontalDifference = sideTwoHorizontal - sideOneHorizontal;
        int verticalDifference = sideTwoVertical - sideOneVertical;
        return Math.pow(horizontalDifference,2) + Math.pow(verticalDifference,2);
    }
}
