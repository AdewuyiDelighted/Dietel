package MyAssessment;

import java.util.Arrays;

public class InitArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int [] array = new int [ARRAY_LENGTH];


        for(int count = 0;count < array.length;count++){
            array[count] = 2 + 2 * count;
        }
        for(int count = 0;count < array.length;count++){
            System.out.println(count + " "+" "+array[count]);
        }
    }
}
