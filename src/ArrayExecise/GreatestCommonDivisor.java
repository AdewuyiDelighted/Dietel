package ArrayExecise;

import java.util.ArrayList;
import java.util.Objects;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // System.out.println(maximum(8, 4, 3, 2, 1));
       // System.out.println(duplicate(8, 4, 3, 2, 1));
         System.out.println(gcd(8,4,3,2,1));
    }


    public static int max(int... numbers) {
        int max = numbers[0];
        for (int num = 0; num < numbers.length; num++) {
            if (numbers[num] > max) {
                max = numbers[num];
            }

        }
        return max;
    }

    public static ArrayList<Integer> factorsOfIndex(int... numbers) {
        int maxOfNumbers = max(numbers);
        ArrayList<Integer> factorsOfAllIndexes = new ArrayList<>();
        for (int numb = 0; numb < numbers.length; numb++) {
            for (int num = 1; num <= maxOfNumbers; num++) {
                if (numbers[numb] % num == 0) {
                    factorsOfAllIndexes.add(num);

                }
            }
        }
        return factorsOfAllIndexes;
    }

    public static ArrayList<Integer> duplicate(int... numbers) {
        int max = max(numbers);
        ArrayList<Integer> lists = factorsOfIndex(numbers);
        int length = lists.size();
        for (int num = 0; num < length; num++) {
            for (int numb = num + 1; numb < length; numb++) {
                if (Objects.equals(lists.get(num), lists.get(numb))) {
                    lists.set(numb, 0);

                }

            }
        }
        return lists;
    }
    public static int newLength(int...numbers){
        int max = max(numbers);
        int length = 0;
        ArrayList<Integer> lists = factorsOfIndex(numbers);
        ArrayList<Integer> duplicate = duplicate(numbers);
        for(int num = 0; num < duplicate.size();num++){
            if(duplicate.get(num) != 0){
                length++;

            }
        }
        return length;


    }

    public static int gcd(int... numbers) {
        int max = max(numbers);
        int hcf = 0;
        ArrayList<Integer> lists = factorsOfIndex(numbers);
        ArrayList<Integer> duplicates = duplicate(numbers);
        int maxi = duplicates.get(0);
        for (int num = 0; num < duplicates.size(); num++) {
            for (int numb = 0; numb < numbers.length; numb++) {
                if(duplicates.get(num) == 0) {
                    continue;
                }
                 if(numbers[num] % duplicates.get(numb) == 0){
                    hcf = duplicates.get(num);
                }

            }
        }
    return hcf;
    }



    }







