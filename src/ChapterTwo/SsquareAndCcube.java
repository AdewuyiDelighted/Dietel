package ChapterTwo;

public class SsquareAndCcube {
    public static void main(String[] args) {
        System.out.println("Number\t\tSquare\t\tCube");
        int num = 1;
        int square = 0;
        int cube = 0;
        for(int number = 1; number <=10;number++){
            square = number * number;
            cube = number * square;
            System.out.println(number+"\t\t\t"+square+"\t\t\t"+cube);

        }

    }
}
