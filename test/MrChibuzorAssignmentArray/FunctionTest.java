package MrChibuzorAssignmentArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionTest {
    @Test
    public void testTheHighestElementInFunction1() {
        int[] integer = {1, 2, 3, 4, 5, 6, 7};
        int result = Function.highestElement(integer);
        assertEquals(7, result);
    }

    @Test
    public void testTheHighestElementInFunction2() {
        int[] integer = {56, 78, 94, 23, 89, 25, 79, 67, 34, 10};
        int result = Function.highestElement(integer);
        assertEquals(94, result);
    }

    @Test
    public void testTheHighestElementInFunction3() {
        int[] integer = {102, 234, 567, 356, 789, 100};
        int result = Function.highestElement(integer);
        assertEquals(789, result);

    }

    @Test
    public void testTheReverseOfElementInArray1() {
        int[] integer = {1, 2, 3, 4};
        int[] answer = {4, 3, 2, 1};
        int[] result = Function.reverse(integer);
        assertArrayEquals(answer, result);

    }

    @Test
    public void testTheReverseOfElementInArray2() {
        int[] integer = {10, 45, 34, 26, 9, 12};
        int[] result = Function.reverse(integer);
        assertArrayEquals(new int[]{12, 9, 26, 34, 45, 10}, result);
    }

    @Test
    public void testTheReverseOfElementInArray3() {
        int[] integer = {324, 456, 789, 123, 256};
        int[] result = Function.reverse(integer);
        assertArrayEquals(new int[]{256, 123, 789, 456, 324}, result);
    }

    @Test
    public void testTheFunctionOfCheckElement1() {
        int[] number = {2, 3, 7, 8};
        int element = 5;
        boolean result = Function.checkElement(number, element);
        assertFalse(result);
    }

    @Test
    public void testTheFunctionOfCheckElement2() {
        int[] integer = {6, 7, 5, 3, 9};
        int element = 5;
        boolean result = Function.checkElement(integer, element);
        assertTrue(result);
    }

    @Test
    public void testTheFunctionOfCheckElement3() {
        int[] integer = {24, 56, 78, 90, 23};
        int element = 24;
        boolean result = Function.checkElement(integer, element);
        assertTrue(result);
    }

    @Test
    public void testTheFunctionOfOddlyPlacedElement1() {
        int[] integer = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = Function.oddlyPlaced(integer);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, result);
    }

    @Test
    public void testThatTheFunctionOfOddlyPlacedElement2() {
        int[] integer = {36, 68, 35, 92, 46, 12, 48, 13, 24, 11};
        int[] result = Function.oddlyPlaced(integer);
        assertArrayEquals(new int[]{68, 92, 12, 13, 11}, result);
    }

    @Test
    public void testThatTheFunctionOfOddlyPlacedElement3() {
        int[] integer = {123, 465, 374, 234, 576, 110, 675, 284, 576};
        int[] result = Function.oddlyPlaced(integer);
        assertArrayEquals(new int[]{465, 234, 110, 284}, result);
    }

    @Test
    public void testTheElementPlacedEvenly1() {
        int[] integer = {12, 23, 34, 56, 78, 19, 20, 45};
        int[] result = Function.evenlyPlaced(integer);
        assertArrayEquals(new int[]{12, 34, 78, 20}, result);
    }

    @Test
    public void testTheElementPlacedEvenly2() {
        int[] integer = {86, 50, 90, 21, 57, 10, 58, 20, 45, 32, 10};
        int[] result = Function.evenlyPlaced(integer);
        assertArrayEquals(new int[]{86, 90, 57, 58, 45, 10}, result);

    }

    @Test
    public void testTheElementPlacedEvenly3() {
        int[] integer = {112, 345, 654, 876, 929, 700, 278, 432};
        int[] result = Function.evenlyPlaced(integer);
        assertArrayEquals(new int[]{112, 654, 929, 278}, result);
    }

    @Test
    public void testTheRunningSumOfElements1() {
        int[] integer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = Function.runningSum(integer);
        assertArrayEquals(new int[]{55}, result);
    }

    @Test
    public void testTheRunningSumOfElements2() {
        int[] integer = {132, 243, 567, 921, 456};
        int[] result = Function.runningSum(integer);
        assertArrayEquals(new int[]{2319}, result);

    }

    @Test
    public void testTheRunningSumOfElements3() {
        int[] integer = {45, 67, 93, 23, 80, 23};
        int[] result = Function.runningSum(integer);
        assertArrayEquals(new int[]{331}, result);
    }

    @Test
    public void testIfTheStringIsPalindrome1() {
        String name = "Delighted";
        boolean result = Function.palindrome(name);
        assertFalse(result);
    }

    @Test
    public void testIfTheStringIsPalindrome2() {
        String identifier = "noon";
        boolean result = Function.palindrome(identifier);
        assertTrue(result);
    }

    @Test
    public void testIfTheStringIsPalindrome3() {
        String identifier = "45554";
        boolean result = Function.palindrome(identifier);
        assertTrue(result);
    }

    @Test
    public void testTheSumOfElementUsingForLoop() {
        int[] integer = {2, 2, 5, 7, 8, 10, 23, 34};
        int[] result = Function.sumForLoop(integer);
        assertArrayEquals(new int[]{91}, result);
    }

    @Test
    public void testTheSumOfElementUsingWhileLoop() {
        int[] integer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = Function.sumWhileLoop(integer);
        assertArrayEquals(new int[]{55}, result);
    }

    @Test
    public void testTheSumOfElementUsingDoWhileLoop() {
        int[] integer = {3, 5, 6, 8, 9, 2, 4, 6};
        int[] result = Function.sumDoWhileLoop(integer);
        assertArrayEquals(new int[]{43}, result);

    }

    @Test
    public void testTheConcatenation1() {
        String  [] letters = new String[] {"a","b","c"};
        String [] integer = new String[]{"1","2","3"};
        String [] result = (Function.concatenate(letters, integer));
        assertArrayEquals(new String[]{"a","b","c","1","2","3"}, result);
    }
    @Test
    public void testTheConcatenation2(){
        String  [] letters = new String[] {"d","e","l","i","g","h","t","e","d"};
        String [] integer = new String[]{"1","2","3","4","5","6","7"};
        String [] result = (Function.concatenate(letters, integer));
        assertArrayEquals(new String[]{"d","e","l","i","g","h","t","e","d","1","2","3","4","5","6","7"}, result);
    }
    @Test
    public void testTheConcatenation3(){
        String  [] letters = new String[] {"s","e","m","i","c","o","l","o","m"};
        String [] integer = new String[]{"1","2","3","4","5","6","7"};
        String [] result = (Function.concatenate(letters, integer));
        assertArrayEquals(new String[]{"s","e","m","i","c","o","l","o","m","1","2","3","4","5","6","7"},result);
    }
    @Test
    public void testTheCombinationOfElements1(){
        String [] letters = new String []{"a","b","c"};
        String [] integer = new String[]{"1","2","3"};
        String [] result = (Function.combinationElement(letters,integer));
        assertArrayEquals(new String[]{"a","1","b","2","c","3"},result);
    }
    @Test
    public void testTheCombinationOfElements2(){
    String  [] letters = new String[] {"d","e","l","i"};
    String [] integer = new String[]{"1","2","3","4"};
    String [] result = (Function.combinationElement(letters, integer));
    assertArrayEquals(new String[]{"d","1","e","2","l","3","i","4"},result);
}
@Test
    public  void testThatNumberCanBeConvertToList1(){
        int number = 4567;
        int [] result = Function.convertToArray(number);
        assertArrayEquals(new int[]{4,5,6,7},result);
}
@Test
public  void testThatNumberCanBeConvertToList2(){
        int number = 2342;
        int [] result = Function.convertToArray(number);
        assertArrayEquals(new int[]{2,3,4,2},result);
    }
    @Test
    public void testThatNumberCanBeConvertedToList3(){
        int number = 123456789;
        int [] result = Function.convertToArray(number);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9},result);
    }
}







