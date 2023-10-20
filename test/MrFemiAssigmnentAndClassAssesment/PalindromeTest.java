package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void testThatInputIsPalindrome(){
        String words = "noon";
        String answer = "noon";
        boolean result = Palindrome.palindrome(words);
        assertTrue(result);

    }

}