package Chapter7;

import org.junit.jupiter.api.Test;

import static Chapter7.PixelQuantization.quantized;
import static org.junit.jupiter.api.Assertions.*;

public class PixelQuantizationTest {
    @Test

    public void testThatPixelQuantiaztionAtFirstLevel() {
        int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};
        byte answer = 10;
        byte result = quantized((byte) 15);
        assertEquals(answer, result);
    }

    @Test
    public void testThatPixelQuantiaztionAtSecondLevel() {
        int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};
        byte answer = 30;
        byte result = quantized((byte) 25);
        assertEquals(answer, result);
    }

    @Test
    public void testThatPixelQuantiaztionAtThirdLevel() {
        int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};
        byte answer = 50;
        byte result = quantized((byte) 56);
        assertEquals(answer, result);
    }

    @Test
    public void testThatPixelQuantiaztionAtFourthLevel() {
        int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};
        byte answer = 70;
        byte result = quantized((byte) 66);
        assertEquals(answer, result);
    }

    @Test
    public void testThatPixelQuantiaztionAtFifthLevel() {
        int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};
        byte answer = 90;
        byte result = quantized((byte) 88);
        assertEquals(answer, result);
    }

    @Test
    public void testThatPixelQuantiaztionAtSixthLevel() {
        int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};
        byte answer = 110;
        byte result = quantized((byte) 112);
        assertEquals(answer, result);
    }

    @Test
    public void testThatPixelQuantiaztionAtSeventhLevel() {
        int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};
        int answer = 130;
        int result = quantized(138);
        assertEquals(answer, result);

    }

    @Test
    public void testThatPixelQuantiaztionAtEighthLevel() {
        int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};
        int answer = 150;
        int result = quantized(150);
        assertEquals(answer, result);
    }
@Test
public void testThatPixelQuantiaztionAtNinthLevel() {
    int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};
    int answer = 170;
    int result = quantized(167);
    assertEquals(answer, result);
}
@Test
public void testThatPixelQuantiaztionAtTenthLevel() {
    int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};
    int answer = 190;
    int result = quantized(200);
    assertEquals(answer, result);
}
}