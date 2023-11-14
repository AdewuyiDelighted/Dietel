package ArrayExecise;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {4,7,1,8,3,5,9,1};
        System.out.println(Arrays.toString(insertSort(array)));
    }
    public static int[] insertSort(int [] array){
        for(int index = 0; index < array.length;index++){
            for(int count = index+1;count < array.length;count++){
                int smallest = array[index];
                if(array[count] < smallest){
                    int temp = array[index];
                    array[index] = array[count];
                    array[count] = temp;
                }
            }
        }
        return array;
    }

}
