package ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeartRateTest {
    @Test
    public void testTheNameOfTheUser() {
        HeartRate heartRate = new HeartRate();
        heartRate.setFirstName("Blessed");
        assertEquals("Blessed", heartRate.getFirstName());
    }

    @Test
    public void testTheSurnameOfTheUser() {
        HeartRate heartRate = new HeartRate();
        heartRate.setLastName("Adewuyi");
        assertEquals("Adewuyi", heartRate.getLastName());

    }

    @Test
    public void testTheBirthDateOfUser() {
        HeartRate heartRate = new HeartRate();
        heartRate.setDayOfBirth(26);
        assertEquals(26, heartRate.getDayOfBirth());

    }

    @Test
    public void testTheBirthMonthOfUser() {
        HeartRate heartRate = new HeartRate();
        heartRate.setMonthOfBirth(1);
        assertEquals(1, heartRate.getMonthOfBirth());
    }

    @Test
    public void testTheBirthYearOfUser() {
        HeartRate heartRate = new HeartRate();
        heartRate.setYearOfBirth(2007);
        assertEquals(2007, heartRate.getYearOfBirth());
    }

    @Test
    public void testTheAgeOfUser() {
        HeartRate heartRate = new HeartRate();
        heartRate.setAge(2007, 2023);
        assertEquals(16, heartRate.getAge());
    }
    @Test
    public void testTheMaximumHeartRateOfUser(){
        HeartRate heartRate = new HeartRate();
            heartRate.setMaximumHeartRate(2007,2023);
            assertEquals(204,heartRate.getMaximumHeartRate());
    }
@Test
    public void testTheTargetedHeartOne(){
    HeartRate heartRate = new HeartRate();
    heartRate.setMaximumHeartRate(2007,2023);
    double result = heartRate.getTargetHeartRateOne();
    assertEquals(102,result);
}
@Test
public void testTheTargetedHeartTwo(){
        HeartRate heartRate = new HeartRate();
        heartRate.setMaximumHeartRate(2007,2023);
        double result = heartRate.getTargetHeartRateTwo();
        assertEquals(173.4,result);
    }
}


