package MrChibuzorAssignment;

import ArrayExecise.Convert;

import java.util.ArrayList;
import java.util.Arrays;

public class FillArrayWithDoubleElement {
    Convert

    public static int[] fillArrayWithDoubleElement(int[] input) {
        int count = input.length;
        int [] doubleLength = new int[input.length*2];
        for(int index = 0;index < input.length;index++){
            doubleLength[index] = input[index];
            doubleLength[count] = input[index]*2;
            count++;
        }
        return doubleLength;
    }

}
