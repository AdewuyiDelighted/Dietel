package ChapterSeven;

import java.util.Arrays;

public class ArrayBonus {
    public static void main(String[] args) {
        int[] numbe = {2, 3, 7, 8, 3, 1, 6, 9, 4, 10, 3, 7, 8, 4, 6, 10, 2, 5, 9, 2};
        overall(numbe);


    }

    public static void overall(int[] number) {
        tenHighest(number);
        arrange(number);
    }

    public static int[] tenHighest(int[] number) {
        int count = 10;
        for (int index = 0; index < 10; index++) {
            number[count] = 0;
            count++;
        }
        return number;
    }

    public static void arrange(int[] number) {
        int[] total = new int[10];
        int product = 2;
        int count = 0;
        for (int index = 0; index < number.length; index++) {
            number[index] *= product;
            if (number[index] != 0) {
                total[index] = number[index];
                System.out.println(total[index]);
            }
        }
    }
}


