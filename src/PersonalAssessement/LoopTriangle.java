package PersonalAssessement;

public class LoopTriangle {

        public static void main(String[] args) {
            int number  = 5;
            for(int row = 1; row<=number; row++){
                for(int column = row;column<=number;column++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }


    }


