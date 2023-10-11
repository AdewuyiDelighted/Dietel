package CardValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class CardCheckerTest {
     @Test
     
     public void testTheCardValidator(){
         String number = "4388576018402626";
         assertEquals(37,CardCheckerTwo.confirmAccountNumber(number));
     }
     @Test
     public void testTheCardValidatorTwo(){
         String number = "4388576018402626";
         assertEquals(38,CardCheckerTwo.oddlyPlaced(number));

     }
     @Test
     public void testTheCardValidatorThree(){
         String number = "4388576018402626";
         assertEquals(75,CardCheckerTwo.oddlyPlaced(number));

     }
     @Test
     public void testTheCardValidatorFour(){
         String number = "4388576018402626";
          CardCheckerTwo.confirmAccountNumber(number);
          CardCheckerTwo.oddlyPlaced(number);
         assertEquals(75,CardCheckerTwo.combine(number));
     }

}