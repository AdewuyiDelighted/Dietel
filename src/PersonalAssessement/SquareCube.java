package PersonalAssessement;

public class SquareCube {
    public static void main(String[] args) {
        int counter = 0;
        int number = 5;
        for(int row = 0;row<5;row++ ){
            for(int column = row;column<=row;column++){
                int square=row*column;
                String name = "Sqaure";
                System.out.print(name +"\n" + square);
            }
            System.out.println(" ");
        }
    }
}
