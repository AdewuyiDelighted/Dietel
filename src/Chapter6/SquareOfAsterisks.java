package Chapter6;

public class SquareOfAsterisks {


    public static void buildSquare(int side){
        for(int row = 1 ;row <= side; row++){
            for(int column = 1;column <= side; column++){
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }
}
