package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeautifyingStringTest {
    @Test
    public void testThatFunctionReturnWordWithFullStop(){
        String result = BeautifyingString.addFullStop("im a boy" + ' ');
        assertEquals("im a boy .",result);
    }
    @Test
    public void testThatFunctionReturnCapitalizedFirstLetter(){
        String result = BeautifyingString.addCapitalLetter("I Am a boy" + '.');
        assertEquals("I Am a boy.",result);
    }

}