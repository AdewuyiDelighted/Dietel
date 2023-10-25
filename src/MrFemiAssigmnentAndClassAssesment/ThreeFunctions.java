package MrFemiAssigmnentAndClassAssesment;

import java.util.ArrayList;

public class ThreeFunctions {
    public static void main(String[] args) {
      int [] array = {1,2,3,3,2,4,5,6};
        System.out.println(duplicate(array));
        String input = "We Outside";

       System.out.println(spaceIndexs(input));
    }

    public static ArrayList<Integer> duplicate(int[] numbers) {
        ArrayList<Integer> listForDuplicate = new ArrayList<>();
        int[] newArray = new int [numbers.length];
        int count = 0;
        int length = numbers.length;
        for(int index = 0;index < numbers.length;index++){
            newArray[index] = numbers[index];
        }
        for (int index = 0; index < newArray.length; index++) {
            for(int indices = 1; indices < length; indices++) {
                if(newArray[index] == numbers[indices]) {
                    listForDuplicate.add(numbers[index]);
                    int len = indices;
                    numbers[indices] = 0;
                    newArray[len+1] = 0;
                    System.out.println(len);

                }
            }


       }
        return listForDuplicate;

    }

    public static String spaceIndexs(String input) {

        String reversed = "";
        int spaceIndex;
        for(int index = 0; index < input.length(); index++) {
            String inputs = input.charAt(index) + "";
            if (inputs.equals(" ")) {
                spaceIndex = index;
                reversed += stringPalindrome(spaceIndex,input);
            }
        }
        return reversed;
    }
    public static String stringPalindrome(int index,String word) {
        String reverse = "";
        for (int indexs = index - 1; indexs >= 0; indexs--) {
            String inputs = word.charAt(indexs) + "";
            reverse += inputs;
        }
    return reverse;
    }

    public static boolean stringPalindromes(String input) {
        String reverse = "";
        for (int index = input.length() - 1; index >= 0; index--) {
            String inputs = input.charAt(index) + "";
            reverse += inputs;
        }
        if (reverse.equals(input)) {
            return true;
        }
        return false;
    }

}


