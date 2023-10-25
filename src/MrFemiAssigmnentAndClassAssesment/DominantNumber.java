package MrFemiAssigmnentAndClassAssesment;

import java.util.ArrayList;
import java.util.Arrays;

public class DominantNumber {
    public static void main(String[] args) {
        int[] array = {57,2,19,2};
        System.out.println(Arrays.toString(dominant(array)));
    }
    public static int [] dominant(int[] array) {
        int count = 0;
        int counter = 0;
        ArrayList<Integer> factors = new ArrayList<>();
        for(int index = 0;index < array.length;index++){
            for(int indices = index+1;indices < array.length;indices++){
                counter += 1;
                if(array[index] > array[indices]){
                   count++;
                }
            }
            if(count == counter){
                factors.add(array[index]);
            }counter = 0;
            count = 0;
        }
        return convertListToArray(factors);
    }
    public static int [] convertListToArray(ArrayList<Integer> inputs){
        int [] array = new int [inputs.size()];
        for(int index = 0;index < array.length;index++){
            array[index] = inputs.get(index);
        }
        return array;
    }
}
