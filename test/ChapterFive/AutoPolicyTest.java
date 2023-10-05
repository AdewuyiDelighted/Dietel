package ChapterFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoPolicyTest {
    private final AutoPolicy autoPolicy = new AutoPolicy(2355,"Toyota Camary","New York");

@Test
    public void testThatAutoPolicyExist(){
    assertNotNull(autoPolicy);

}
@Test
    public void testThatAccountNumberMethod(){
    autoPolicy.setAccountNumber(2345);
    assertEquals(2345,autoPolicy.getAccountNumber());
}
@Test
    public void testThatTheModelAndMakeOfAutoPolicy() {
    autoPolicy.setMakeAndModel("Toyota Camry");
    assertEquals("Toyota Camry", autoPolicy.getMakeAndModel());
}
@Test
      public void testTheStateOfAutoPolicy(){
    autoPolicy.setState("New York");
    assertEquals("New York",autoPolicy.getState());



}
}

