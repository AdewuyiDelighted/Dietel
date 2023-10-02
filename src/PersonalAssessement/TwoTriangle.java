package PersonalAssessement;

public class TwoTriangle {
    public static void main(String[] args) {
        int counter = 0;
        int number =10;
        for(int row =1;row <=number;row++){
            for(int column = 1;column <=row;column++){
                System.out.print("* ");
            }
            for(int column=1;column<=number;column++){
                System.out.print(" ");
            }
            for(int column=row;column<=number;column++){
                System.out.print("# ");
            }
            System.out.println(" ");
        }
    }
}
