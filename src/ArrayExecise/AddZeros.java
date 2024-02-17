package ArrayExecise;

import java.util.Arrays;

public class AddZeros {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(addZero(new int[][]{{8, 5}, {0, 3},{0,9,8,6},{5,9}})));
    }

    public static int[][] addZero(int[][] array) {
        int indexOfArrayWithZero = 0;
        int lengthOfArrayWithZero = 0;
        for(int index = 0; index < array.length;index++) {
            for (int count = 0; count < array[index].length; count++) {
                if (array[index][count] == 0) {
                    indexOfArrayWithZero = index;
                    lengthOfArrayWithZero = array[index].length;
                }
            }
            convertArrayToZero(indexOfArrayWithZero,lengthOfArrayWithZero,array);
        }
        return  array;
    }

    private static int [][] convertArrayToZero(int indexOfArrayWithZero,int lengthOfArrayWithZero,int [][] array){
        for(int value = 0; value < lengthOfArrayWithZero;value++){
            array[indexOfArrayWithZero][value] = 0;
        }
        return array;
    }
}
