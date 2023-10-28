package Chapter5;


import java.util.Random;

public class BarChart {
    public static void main(String[] args) {
        barOfAsterisks(5);
    }

        public static void barOfAsterisks(int number){
            int bar = 0;
        for(int num = 1; num <= 5; num++) {
            Random random = new Random();
            bar = random.nextInt(30);
            for (int sum = 1; sum <= bar; sum++) {
                System.out.print("*" +" ");
            }
            System.out.println(" ");
        }
        }
    }


