package Chapter6;

import java.util.ArrayList;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }

    public static ArrayList<Integer> factors(int number) {
        ArrayList<Integer> keepFactors = new ArrayList<>();
        for (int index = 1; index < number; index++) {
            if (number % index == 0) {
                keepFactors.add(index);

            }
        }
        return keepFactors;
    }
    public static boolean isPerfect(int number){
        int sum = 0;
        ArrayList<Integer> keepFactors = factors(number);
        for(int index = 0; index < keepFactors.size();index++){
            sum += keepFactors.get(index);
        }
        if(sum == number){
            return true;
        }
        return false;
    }

}
