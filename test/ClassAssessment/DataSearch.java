package ClassAssessment;

import java.util.Arrays;
import java.util.Scanner;

public class DataSearch {

    public static void main(String[] args) {
         int [] [] data = { {40,23,85,62} ,{24,60,99,37},{44,20,12,45},{14,64,35,90}};

        DataSearch dataSearch = new DataSearch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row ");
        int input = scanner.nextInt();
        System.out.println("Enter start");
        int start = scanner.nextInt();
        System.out.println("Enter end");
        int end = scanner.nextInt();
        dataSearch.extract(data,input,start,end);

    }
        public int [] extract(int [][] data,int input,int start,int end){
        int [] total = new int [(end-1)];
        int count = 0;
        for(int row = input-1;row < 1;row++) {
            for (int column = start - 1; column < end - 1; column++) {
                total[count] = data[row][column];
                count++;
               // System.out.println(Arrays.toString(total));
            }

        }
            return total;
    }
}

