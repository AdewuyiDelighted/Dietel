package ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeartProfileTest {
    @Test
    public void testTheNameOfTheUser() {
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setFirstName("Blessed");
        assertEquals("Blessed", heartProfile.getFirstName());
    }

    @Test
    public void testTheSurnameOfTheUser() {
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setLastName("Adewuyi");
        assertEquals("Adewuyi", heartProfile.getLastName());

    }

    @Test
    public void testTheBirthDateOfUser() {
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setDayOfBirth(26);
        assertEquals(26, heartProfile.getDayOfBirth());

    }

    @Test
    public void testTheBirthMonthOfUser() {
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setMonthOfBirth(1);
        assertEquals(1, heartProfile.getMonthOfBirth());
    }



    @Test
    public void testTheBirthYearOfUser() {
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setYearOfBirth(2007);
        assertEquals(2007, heartProfile.getYearOfBirth());
    }

    @Test
    public void testGenderOfUser() {
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setGender("Female");
        assertEquals("Female", heartProfile.getGender());

    }

    @Test
    public void testThatHeightOfUser() {
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setHeight(6.6);
        assertEquals(6.6, heartProfile.getHeight());

    }
@Test
    public void testUserWeight(){
    HeartProfile heartProfile = new HeartProfile();
        heartProfile.setWeight(53.9);
        assertEquals(53.9,heartProfile.getWeight());

}
    @Test
    public void testTheAgeOfUser() {
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setYearOfBirth(2007);
       int result = heartProfile.getAge();
        assertEquals(16, result);
    }
    @Test
    public void testTheMaximumHeartRateOfUser(){
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setYearOfBirth(2007);
       int result = heartProfile.getMaximumHeartRate();
        assertEquals(204,result);
    }
    @Test
    public void testTheTargetedHeartOne(){
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setYearOfBirth(2007);
        heartProfile.getMaximumHeartRate();
        double result = heartProfile.getTargetedHeartRateOne();
        assertEquals(102,result);
    }
    @Test
    public void testTheTargetedHeartTwo(){
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setYearOfBirth(2007);
        heartProfile.getMaximumHeartRate();
        double result = heartProfile.getTargetedHeartRateTwo();
        assertEquals(173.4,result);
    }
    @Test
    public void testTheBodyMassOfUser(){
        HeartProfile heartProfile = new HeartProfile();
        heartProfile.setHeight(6.6);
        heartProfile.setWeight(53.9);
      double result =  heartProfile.getBodyMassIndex();
        assertEquals(37891.7,result);
    }

}





