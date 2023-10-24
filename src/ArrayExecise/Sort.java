package ArrayExecise;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sorted()));
    }

    public static int [] sorted(){
    int [] number = {5,7,4,8,6};
    int [] array = new int[number.length];
    for(int index = 0; index < number.length;index++){
        for(int indices = 1;indices < number.length;indices++) {
            if (number[index] < number [indices]){
                array[index] = number[index];
                array[indices] = number[indices];
            }
        }
    }
   return array;
    }
}