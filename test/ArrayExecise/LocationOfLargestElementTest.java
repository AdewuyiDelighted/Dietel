package ArrayExecise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class LocationOfLargestElementTest {
    @Test
    public void testThatTheRowAndColumAreCreated() {
        int row = 3;
        int column = 4;
        int[][] table = new int[row][column];
        assertArrayEquals(table, LocationOfLargestElement.createTable(row, column));
    }
    @Test
    public void find_the_maximum_number_in_the_table(){
        int [] array = LocationOfLargestElement.findMaximumOf(3,4);
        int [][] table = new int[3][4];
        for(int index = 0; index < table.length;index++){
            for(int count = 0; count < table[index].length;count++){
                System.out.println("Enter number for colum " + (index + 1));
            }
        }
       // assertArrayEquals(expected,LocationOfLargestElement.findMaximumOf(3,4));
    }


}


