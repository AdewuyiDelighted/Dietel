package ChapterFive;

public class Diamond {
    public static void main(String[] args) {

        for(int row = 1; row <= 5; row++) {
            for (int column = row; column <= 5; column++) {
                System.out.print(" ");
            }
            System.out.print(" ");
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            for (int colum = 2; colum <= row; colum++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int row = 2; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" ");
            }
            System.out.print(" ");
            for (int column = row; column < 5; column++) {
                System.out.print("*");
            }
            for (int column = row; column <= 5; column++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }

}
