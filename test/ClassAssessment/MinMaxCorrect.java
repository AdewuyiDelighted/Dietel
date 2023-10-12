package ClassAssessment;

public class MinMaxCorrect {


    public static int sum(int[] number) {
        int total = 0;
        for (int num = 0; num < number.length; num++) {
            total += number[num];
        }
        return total;
    }

    public static int max(int[] number) {
        int max = number[0];
        for (int num = 1; num < number.length; num++) {
            if (number[num] > max) {
                max = number[num];
            }
        }
        return max;
    }

    public static int  min(int[] number) {
        int min = number[0];
        for (int num = 1; num < number.length; num++) {
            if (number[num] < min) {
                min = number[num];
            }
        }
        return min;
    }
    public static int [] maxMin(int [] number){
        int [] array = new int [2];
        int highest = sum(number) - min(number);
        int smallest = sum(number) - max(number);
         array [0] = highest;
         array [1] = smallest;

        return array;
    }

}

