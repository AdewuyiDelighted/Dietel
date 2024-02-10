package MrChibuzorAssignment;

import org.junit.jupiter.api.Test;

import java.util.Dictionary;
import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.*;

class CharacterFrequencyTest {
    @Test
    public void testThatFunctionReturnsADictionaryWithTheKeyAsTheElementAndPairAsTheCount() {
        String input = "semicolon.africa";
        Dictionary<String, Integer> dict = new Hashtable<>();
        dict.put("s", 1);
        dict.put("e", 1);
        dict.put("m", 1);
        dict.put("i", 2);
        dict.put("c", 2);
        dict.put("o", 2);
        dict.put("l", 1);
        dict.put("n", 1);
        dict.put(".", 1);
        dict.put("a", 2);
        dict.put("f", 1);
        dict.put("r", 1);
        assertEquals(dict, CharacterFrequency.countElement(input));
    }

    @Test
    public void testThatFunctionReturnsADictionaryWithTheKeyAsTheElementAndPairAsTheCountWhenInputIsShorter() {
        String input = "delighted";
        Dictionary<String, Integer> dict = new Hashtable<>();
        dict.put("d", 2);
        dict.put("e", 2);
        dict.put("l", 1);
        dict.put("i", 1);
        dict.put("g", 1);
        dict.put("h", 1);
        dict.put("t", 1);
        assertEquals(dict, CharacterFrequency.countElement(input));
    }

    @Test
    public void testThatFunctionReturnsADictionaryWithTheKeyAsTheElementAndPairAsTheCountWithoutElementNotMoreThanOne() {
        String input = "hair";
        Dictionary<String, Integer> dict = new Hashtable<>();
        dict.put("h", 1);
        dict.put("a", 1);
        dict.put("i", 1);
        dict.put("r", 1);
        assertEquals(dict, CharacterFrequency.countElement(input));
    }


}