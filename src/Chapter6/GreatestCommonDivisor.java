package Chapter6;

import java.util.ArrayList;
import java.util.Collections;

public class GreatestCommonDivisor {


    public static ArrayList<Integer> findFactors(int firstNumber,int secondNumber){
        int length = Math.max(firstNumber,secondNumber);
        ArrayList<Integer> factors = new ArrayList<>();
        for(int index = 1; index <= length;index++){
            if(firstNumber % index == 0 || secondNumber % index == 0){
                factors.add(index);
            }
        }
        return factors;
    }

    public static int findGcd(int firstNumber,int secondNumber){
        ArrayList<Integer> factors = findFactors(firstNumber,secondNumber);
        ArrayList<Integer> limitedFactors = new ArrayList<>();
        int gcd = 0;
        int length = factors.size();
        for(int index = 0;index < length;index++){
            if(firstNumber % factors.get(index) == 0 && secondNumber % factors.get(index) == 0){
                limitedFactors.add(factors.get(index));
                 gcd = Collections.max(limitedFactors);
            }
        }
        return gcd;
    }
}