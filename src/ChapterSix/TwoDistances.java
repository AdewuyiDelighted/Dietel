package ChapterSix;

public class TwoDistances {
    public static void main(String[] args) {
        System.out.println(distance(3,2,7,8));

    }


    public static double distance(int sideOneHorizontal,int sideOneVertical, int sideTwoHorizontal,int sideTwoVertical){
        int horizontalDifference = sideTwoHorizontal - sideOneHorizontal;
        int verticalDifference = sideTwoVertical - sideOneVertical;
        return Math.pow(horizontalDifference,2) + Math.pow(verticalDifference,2);
    }
}
