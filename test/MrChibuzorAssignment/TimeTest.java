package MrChibuzorAssignment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    Time time;

    @BeforeEach
    void setUp() {
        time = new Time(23, 8, 9);

    }

    @Test
    public void testThatClassHasHourAndMinuteSeconds() {
        time = new Time(20, 8, 3);
        assertEquals(20, time.getHour());
        assertEquals(8, time.getMinute());
        assertEquals(3, time.getSecond());


    }

    @Test
    public void testThatHour() {
        assertThrows(IllegalArgumentException.class, () -> new Time(30, 4, 6));
    }

}