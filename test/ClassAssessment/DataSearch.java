package ClassAssessment;

import java.util.Arrays;
import java.util.Scanner;

public class DataSearch {
        public int [] extract(int [][] data,int input,int start,int end){
        int [] total = new int [end-1];
        int count = 0;
        for(int row = input-1;row < 1;row++) {
            for (int column = start - 1; column < end - 1; column++) {
                total[count] = data[row][column];
                count++;

            }

        }
            return total;
    }
}

