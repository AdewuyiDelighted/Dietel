package ArrayExecise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    @Test
    public void testThatFunctionSortNumbersInAscendingOrder(){
        int [] number = {23,4,12,6,2,50,98,15};
        int [] answer = {2,4,6,12,15,23,50,98};
        int [] check = Sort.ascending(number);
        assertArrayEquals(answer,check);
    }
    @Test
    public void testThatFunctionSortNumbersInAscendingOrderTwo(){
        int [] number = {45,29,20,34,25};
        int [] answer = {20,25,29,34,45};
        int [] check = Sort.ascending(number);
        assertArrayEquals(answer,check);
    }
    @Test
    public void testThatFunctionSortNumbersInAscendingOrderThree(){
        int [] number = {2,9,5,4,8,1,6};
        int [] answer = {1,2,4,5,6,8,9};
        int [] check = Sort.ascending(number);
        assertArrayEquals(answer,check);
    }



}