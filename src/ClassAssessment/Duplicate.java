package ClassAssessment;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int [] all = {4,9,4,4,7,9,1,7};

        System.out.println(Arrays.toString(remove(all)));
    }


    public static int [] remove(int [] numbers){
        for(int num = 0;num < numbers.length;num++){
            for(int numb = num + 1;numb < numbers.length;numb++){
                if(numbers [num] == numbers[numb]){
                   numbers[numb] = 0;


                }
            }
        }
        int len = length(numbers);
        int[] num = arrange(numbers,len);
        return num;
}

public static  int length(int [] numbers) {
    int lengths = 0;
    for (int index = 0; index < numbers.length; index++) {
        if (numbers[index] != 0) {
            lengths++;
        }
    }
    return lengths;

}
public static int [] arrange(int [] numbers,int length){
        int count = 0;
        int [] array = new int[length];
        for(int index = 0;index < numbers.length;index++) {
            if (numbers[index] != 0) {
                array[count] = numbers[index];
                count++;
            }
        }
        return array;
    }
}
