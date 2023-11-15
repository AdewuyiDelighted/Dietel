package ArrayExecise;

import java.util.ArrayList;
import java.util.List;



public class DuplicateElements {
    public static int[] checkDuplicateOf(int [] array){
        List<Integer> result = new ArrayList<>();
        for(int number: array){
            if(!result.contains(number)) result.add(number);
        }
        return convertToArray(result);
    }

    public static int[] convertToArray(List<Integer> numbers) {
        int[] result = new int[numbers.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = numbers.get(i);
        }
        return result;
    }
}
