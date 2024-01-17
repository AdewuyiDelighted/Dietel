package MrFemiAssigmnentAndClassAssesment;

import java.util.Arrays;

public class SquareOfElementsInAscending {

    public static int[] squareOfElementsInAscendingOrder(int[] input) {
        int[] squaredElements = new int[input.length];
        for(int indices = 0; indices < input.length;indices++){
            squaredElements[indices] = input[indices] * input[indices];

        }

        for (int index = 0; index < input.length; index++) {
            for (int count = index + 1; count < input.length; count++) {
                if (squaredElements[index] > squaredElements[count]) {
                    int temp = squaredElements[index];
                    squaredElements[index] = squaredElements[count];
                    squaredElements[count] = temp;
                }
            }
        }
        return squaredElements;
    }
}
