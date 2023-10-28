package Chapter6;

public class SquareAnyCharacter {


    public static void squareAnyCharacter(int side,char fillCharacter){
        for(int index = 0; index < side;index++){
            for (int indices = 0;indices < side;indices++){
                System.out.print(fillCharacter);
            }
            System.out.println(" ");
        }

    }
}
