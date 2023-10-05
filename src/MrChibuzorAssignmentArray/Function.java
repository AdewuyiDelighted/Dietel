package MrChibuzorAssignmentArray;


import java.util.Arrays;

public class Function {

    public static void main(String[] args) {

    }
    public static int highestElement(int[] number) {
        int maxi = number[0];
        for (int num = 1; num < number.length; num++) {
            if (number[num] > maxi) {
                maxi = number[num];
            }
        }
        return maxi;
    }
    public static int[] reverse(int[] number) {
        int[] convert = new int[number.length];
        int count = 0;
        for (int num = number.length - 1; num >= 0; num--) {
            convert[count] = number[num];
            count++;
        }
        return convert;
    }
    public static boolean checkElement(int[] number, int element) {
        boolean result = false;
        for (int num = 0; num < number.length; num++) {
            if (element == number[num]) {
                //result = true;
                return true;
            }
        }
        return false;
    }
    public static int[] oddlyPlaced(int[] number) {
        int[] oddPlaced = new int[number.length / 2];
        int count = 0;
        for (int num = 1; num < number.length; num = num + 2) {
            oddPlaced[count] = number[num];
            count++;
        }
        return oddPlaced;
    }
    public static int[] evenlyPlaced(int[] number) {
        int[] evenPlaced = new int[number.length];
        if (number.length % 2 != 0) {
            evenPlaced = new int[number.length / 2 + 1];
        } else {
            evenPlaced = new int[number.length / 2];
        }
        int count = 0;
        for (int num = 0; num < number.length; num = num + 2) {
            evenPlaced[count] = number[num];
            count++;
        }
        return evenPlaced;
    }
    public static int[] runningSum(int[] numbers) {
        int[] runSum = new int[1];
        for (int num = 0; num < numbers.length; num++) {
            runSum[0] += numbers[num];
        }
        return runSum;
    }
    public static boolean palindrome(String name) {
        String reverse = "";
        int number = 0;
        boolean result = false;

        for (int num = name.length() - 1; num >= 0; num--) {
            reverse = reverse + name.charAt(num) + "";
            number++;
        }
        if (reverse.equals(name)) {
            result = true;
        }
        return result;
    }

    public static int[] sumForLoop(int[] number) {
        int[] sum = new int[1];
        for (int num = 0; num < number.length; num++) {
            sum[0] += number[num];
        }
        return sum;
    }
    public static int[] sumWhileLoop(int[] number) {
        int[] sum = new int[1];
        int count = 0;
        while (count < number.length) {
            sum[0] += number[count];
            count++;
        }
        return sum;
    }
    public static int[] sumDoWhileLoop(int[] number) {
        int[] sum = new int[1];
        int count = 0;
        do {
            sum[0] += number[count];
            count++;
        }
        while (count < number.length);
        return sum;
    }
    public static String[] concatenate(String[] letters, String[] number) {
        String[] combine = new String[letters.length + number.length];
        int count = 0;
        for (int num = 0; num < letters.length; num++) {
            combine[count] = letters[num];
            count++;
        }
        for (int numb = 0; numb < number.length; numb++) {
            combine[count] = number[numb];
            count++;
        }
        return combine;
    }

    public static String[] combinationElement(String[] letter, String[] number) {
        String[] sum = new String[letter.length + number.length];
        int count = 0;
        int counter = 0;
        for (int num = 0; num < sum.length; num = num + 2) {
            sum[num] = letter[count];
            count++;
        }
        for (int numb = 1; numb < sum.length; numb = numb + 2) {
            sum[numb] = number[counter];
            counter++;
        }
        return sum;
    }
   public static int [] convertToArray(int number){
        String string = String.valueOf(number);
        int numb = string.length();
        int divide = 1;
        int sum = 1;
        for(int num = 1;num < numb;num++){
            divide *= 10;
        }
        int firstNum = number / divide % 10;
       int [] reverse  = new int [numb];
       reverse [0] = firstNum;
       int newDivide = divide / 10;
       for(int index = 1;index < numb;index++){
           int count = number/newDivide % 10;
            reverse [sum] = count;
            newDivide /= 10;
            sum ++;
       }
        return reverse;




    }
}


