package ChapterFive;

import java.util.Scanner;

public class DiamondOdd {
    public static void main(String[] args) {
        //String age = "Five";
        print(row(5));
        //print(upColumn(1,5));

    }

//    public static int triangle(int number){
//        row(5);
//        upColumn(row(),5);
//
//    }

    public static String row(int numberb) {
        String result = "*";
        for (int row = 1; row <= numberb; row++) {
            System.out.print(result);
        }
        return result;
    }

//    public static String upColumn(int row, int number) {
//        String result = "*";
//        for (int column = row; column <= number; column++) {
//            System.out.print(result);
//        }
//            return result;
   // }


        public static String print (String collect){
            System.out.println(collect);
            return collect;
        }


        public static int print ( int collect){
            System.out.println(collect);
            return collect;
        }
        public static int input ( int collect){
            Scanner scanner = new Scanner(System.in);
            collect = scanner.nextInt();
            return collect;

        }

    }
