package ClassAssessment;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();
        int [] all = {4,9,4,4,7,9,1,7};
        System.out.println(Arrays.toString(duplicate.remove(all)));
    }

    public int [] remove(int [] numbers){
       // int [] compare = new int[numbers.length];
        for(int num = 0;num < numbers.length;num++){
            for(int numb = 1;numb < numbers.length;numb++){
                if(numbers [num] == numbers[numb]){
                   numbers[numb] = 0;
                    //System.out.println(Arrays.toString(numbers));
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
            return numbers;
}


}
