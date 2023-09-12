package PersonalAssessement;

public class FourTriangle {
    public static void main(String[] args) {
        int number = 10;
        int counter = 0;
        for(int row=1;row<=10;row++){
            for(int column=1;column<=row;column++){
                System.out.print("* ");
            }
        for(int column = 1;column<=number;column++){
            System.out.print(" ");
        }
        for(int column=row;column<=number;column++){
            System.out.print("# ");
        }
        for(int column =1;column<=number;column++){
            System.out.print("  ");
        }
            for(int column=1;column<=row;column++){
                System.out.print("* ");
            }
       for(int column=1;column<=number;column++){
           System.out.print(" ");
       }
        for (int column=row;column<=number;column++){
            System.out.print("# ");
        }
            System.out.println("   ");
        }

    }
}
