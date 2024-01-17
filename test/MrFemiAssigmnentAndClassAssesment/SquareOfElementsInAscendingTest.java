package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareOfElementsInAscendingTest {
    @Test
    public void testThatInputReturnTheSquareOfElementInAscendingOrder(){
        int [] input = {2,5,3,8,6,4};
        int [] expected = {4,9,16,25,36,64};
        assertArrayEquals(expected,SquareOfElementsInAscending.squareOfElementsInAscendingOrder(input));
    }
    @Test
    public void testThatInputReturnTheSquareOfElementInAscendingOrderWhenNumberAreGreaterTen(){
        int [] input = {-12, 11,17,12,14,18,10,15};
        int [] expected = {100,121,144, 144,196,225,289,324};
        assertArrayEquals(expected,SquareOfElementsInAscending.squareOfElementsInAscendingOrder(input));
    }
    @Test
    public void testThatInputReturnTheSquareOfElementInAscendingOrderWhenNumberAreLesserOne(){
        int [] input = {11,17,12,14,18,10,-15};
        int [] expected = {100,121,144,196,225,289,324};
        assertArrayEquals(expected,SquareOfElementsInAscending.squareOfElementsInAscendingOrder(input));
    }



}