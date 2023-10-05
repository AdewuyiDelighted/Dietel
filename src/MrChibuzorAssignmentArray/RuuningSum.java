package MrChibuzorAssignmentArray;

import java.util.Arrays;

public class RuuningSum {
    public static void main(String[] args) {


        //public static int[] runningSum ( int[] number){
            int [] number ={1,2,3,4,5} ;
            int[] sum = {number.length};
            int count = 0;
            for (int num = 0; num < number.length -1;num++) {
                sum[count] += number[num];
                count++;
                //sum[count] += number[num];
            }
                System.out.println(Arrays.toString(sum));
        }
    }

