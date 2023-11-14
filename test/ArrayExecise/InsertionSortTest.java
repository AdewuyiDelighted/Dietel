package ArrayExecise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    @Test
    public void testThatFunctionReturnTheInsertionSortingIfThereDoubleOFAParticularNumber(){
        int [] array = {4,7,1,8,3,5,9,1};
        int [] answer = {1,1,3,4,5,7,8,9};
        assertArrayEquals(answer,InsertionSort.insertSort(array));
    }
    @Test
    public void testThatFunctionReturnTheInsertionSortingInTens(){
        int [] array = {45,78,23,12,98,34};
        int [] answer = {12,23,34,45,78,98};
        assertArrayEquals(answer,InsertionSort.insertSort(array));
    }
    @Test
    public void testThatFunctionReturnTheInsertionSortingIfThereIsNegativeNumber(){
        int [] array = {-6,2,0,-2,-8,3};
        int [] answer = {-8,-6,-2,0,2,3};
        assertArrayEquals(answer,InsertionSort.insertSort(array));
    }
    @Test
    public void testThatFunctionReturnTheInsertionSorting(){
        int [] array = {103,67,167,13,78};
        int [] answer = {13,67,78,103,167};
        assertArrayEquals(answer,InsertionSort.insertSort(array));
    }








}