package MrChibuzorAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfPrimeFactor {


    public static int[] primeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int index = 2; index <= number; index++) {
            while (number != 1) {
                if (number % index == 0) {
                    factors.add(index);
                    number/= index;

                } else {
                   index++;
                    }
                }
        }
        return productOfPrimeFactor(factors);
    }
        public static int [] productOfPrimeFactor(ArrayList<Integer>factors){
        int [] array = new int [factors.size()];
        for(int index = 0;index < factors.size();index++){
            array[index] = factors.get(index);
        }
        return array;
        }
}








