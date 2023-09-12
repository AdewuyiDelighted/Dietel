package PersonalAssessement;

public class CorrectUpsideTriangle {
    public static void main(String[] args) {
        for (int row = 1; row <= 7; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");
            }
            for (int column = row; column <= 7; column++) {
                System.out.print("# ");
            }
            for (int column = 1; column <= 5; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            for (int column = 1; column <= 5; column++) {
                System.out.print("  ");
            }
           for(int column =row;column<=7;column++){
               System.out.print("* ");

           }
           for(int column =1;column<=5;column++){
               System.out.print(" ");
           }
           for(int column = 1;column<=row;column++){
                System.out.print("# ");
            }
            System.out.println(" ");
        }
    }
}