package MrChibuzorAssignment;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionTest {

    @Test
    public void testThatFunctionCanDetectEvenNumber() {
        boolean even = Function.evenNUM(4);
        assertTrue(even);
    }

    @Test
    public void testThatFunctionCanDetectNonPrimeNumber() {
        boolean prime = Function.primeNumber(4);
        assertFalse(prime);

    }
    @Test
    public void testThatFunctionCanDetectPrimeNumber() {
        boolean prime = Function.primeNumber(5);
        assertTrue(prime);


    }

    @Test
  public void testThatFunctionCanSubtractWithoutNegativeReturn(){
        int total = Function.subtract(3,7);
        assertEquals(4,total);
    }
    @Test
    public void testThatFunctionCanSubtract(){
        int total = Function.subtract(7,3);
        assertEquals(4,total);
    }
    @Test
    public void testThatFunctionCanDivideAndReturnTwoDecimalPlace(){
        double total= Function.divide(6,3);
        assertEquals(2.00,total);
    }
    @Test
    public void testThatFunctionWhenSecondNumberIsZero(){
        double total = Function.divide(10,0);
        assertEquals(0.00,total);
    }
@Test
    public void testThatFunctionReturnFactor(){
        int total = Function.factor(10);
        assertEquals(4,total);
}
@Test
    public void testThatFunctionCanDetectWhenNumberIsSquare(){
        boolean  total= Function.square(5);
         assertFalse(total);

}
@Test
    public void testThatFunctionCanDetectWhenNumberIsPalindromeNumberIsNotMoreThAnFiveDigit(){
        boolean total = Function.palindrome(897);
        assertFalse(total);

}
@Test
    public void testThatFunctionCanDetectPalindrome(){
        boolean total = Function.palindrome(13331);
        assertTrue(total);
}
@Test
    public void testThatFunctionCanCalculateFactorial(){
        int total = Function.factorial(5);
        assertEquals(120,total);
}
}

