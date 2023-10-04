package ChapterFive;


import java.util.Random;
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
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


