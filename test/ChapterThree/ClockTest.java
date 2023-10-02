package ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    @Test
    public void testThatHourCanIncreaseBeyond23() {
        Clock clock = new Clock(23, 20, 50);
        clock.setHour(24);
        assertEquals(0, clock.getHour());
    }

    @Test
    public void testThatMinuteCantIncreaseBeyond59() {
        Clock clock = new Clock(23, 20, 50);
        clock.setMinute(60);
        assertEquals(0, clock.getMinute());

    }

    @Test
    public void testThatSecondCantIncreaseBeyond59() {
        Clock clock = new Clock(23, 20, 50);
        clock.setSecond(65);
        assertEquals(0, clock.getSecond());

    }

    @Test
    public void testTimeSetting() {
        Clock clock = new Clock(23, 20, 50);
        clock.setHour(21);
        clock.setMinute(45);
        clock.setSecond(56);
        clock.setDisplayTime();
        assertEquals(214556, clock.getDisplayTime());
    }
}