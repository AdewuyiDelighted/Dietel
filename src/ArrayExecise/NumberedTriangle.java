package ArrayExecise;

public class NumberedTriangle {
    public static void main(String[] args) {
        int length = 6;
        int lengthOfSecondTriangle = 6;
        int lengthOfLastTriangle = 6;

        for (int row = 1; row <= 6; row++) {
            for (int column = 1; column <= row; column++) {
                print(column + " ");
            }
            print(" ");

            for (int column = row; column <= length; column++) {
                print("  ");
            }
            print(" ");

            for (int column = 1; column <= lengthOfSecondTriangle; column++) {
                print(column + " ");
            }
            lengthOfSecondTriangle--;
            print(" ");

            for (int column = 1; column <= length; column++) {
                print(" ");
            }
            print(" ");

            for (int column = row; column >= 1; column--) {
                print(column + " ");
            }
            print(" ");

            for (int column = 1; column <= row; column++) {
                print("  ");
            }
            print(" ");

            for (int column = 1; column <= lengthOfLastTriangle; column++) {
                print(column + " ");
            }
            lengthOfLastTriangle--;
            System.out.println(" ");
        }


    }


    private static void print(String message) {
        System.out.print(message);
    }
}
