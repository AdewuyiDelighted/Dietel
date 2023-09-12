package PersonalAssessement;

public class Diamond {
    public static void main(String[] args) {
        int number = 5;
        for(int row = 1;row <=5;row++) {
            for (int column = row; column <= 5; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("# ");
            }
            System.out.println(" ");
        }
        for(int row =1;row<=5;row++){
           for(int column = 1;column<=row;column++){
               System.out.print(" ");
           }
        for(int column=row;column<=5;column++){
            System.out.print("* ");
        }
            System.out.println(" ");
        }
        }
    }
