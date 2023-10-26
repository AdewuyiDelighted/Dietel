package ChapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    @Test
    public void testIfTheNumberIsAPalindrome(){
        boolean expected = PalindromeNumber.palindrome(12321);
        assertTrue(expected);
    }
    @Test
    public void testIfTheNumberIsAPalindromeTwo(){
        boolean expected = PalindromeNumber.palindrome(345672);
        assertFalse(expected);
    }
    @Test
    public void testIfTheNumberIsAPalindromeThree(){
        boolean expected = PalindromeNumber.palindrome(353);
        assertTrue(expected);
    }

}