package Chapter5;

public class PythagoreanTriples {
    public static void main(String[] args) {
        int total = 0;
        int totalTwo = 0;
        int sumOfTwoSides = 0;
        int squareRoot = 0;
        int index = 1;
        int count = 1;
        for (count = 1; count <= 500; count++) {
            total = sqaure(count);
            for (index = 1; index <= 500; index++) {
                totalTwo = sqaure(index);
                sumOfTwoSides = total + totalTwo;
                for (int root = 1; root <= 500; root++) {
                    if (root * root == sumOfTwoSides) {
                        squareRoot = root;
                    }
                }
                System.out.println(count +"  "+index+"   "+squareRoot);
            }

        }

    }


    public static int sqaure(int number) {
        int total = number * number;
            return total;
    }


}
