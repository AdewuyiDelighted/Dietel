package ChapterFive;

public class FourTriangleBelow {
    public static void main(String[] args) {
        int number = 10;
        for(int row = 1;row<= number;row++){
            for(int colum = 1; colum<= row;colum++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for(int row = 1;row <= number;row++){
            for(int column = row;column <= number;column++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
            System.out.println(" ");
        for(int row = 1;row <= number;row++){
            for(int colum = 1;colum <= row;colum++){
                System.out.print(" ");
            }
             System.out.print(" ");
            for(int colum = row;colum <= number;colum++){
                System.out.print("*");
            }
                System.out.println(" ");
            }
            System.out.println(" ");
            for(int row = 1;row <= number; row++){
               for(int colum = row;colum <= number;colum++){
                   System.out.print(" ");
                }
                System.out.print(" ");
                for(int colum = 1;colum <= row;colum++){
                    System.out.print("*");
                }
                System.out.println(" ");
                 }



        }
    }
