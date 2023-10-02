package MyAssessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneTest {
    @Test
    public void testTheFunctionOfPhoneABC(){
        String result = Phone.characters("A");
        assertEquals("2",result);
    }
    @Test
    public  void testTheFunctionOfPhoneDEF(){
        String result = Phone.characters("D");
        assertEquals("3",result);
    }
    @Test
    public  void testTheFunctionOfPhoneGHI(){
        String result = Phone.characters("G");
        assertEquals("4",result);
    }
    @Test
    public  void testTheFunctionOfPhoneJKL(){
        String result = Phone.characters("J");
        assertEquals("5",result);
    }
    @Test
    public  void testTheFunctionOfPhoneMNO(){
        String result = Phone.characters("M");
        assertEquals("6",result);
    }
    @Test
    public void testTheFunctionOfPhonePQRS(){
        String result = Phone.characters("P");
        assertEquals("7",result);
    }
    @Test
    public void testTheFunctionOfPhoneTUV(){
        String result = Phone.characters("T");
        assertEquals("8",result);
    }
    @Test
    public void testTheFunctionOfPhoneWXYZ(){
        String result = Phone.characters("W");
        assertEquals("9",result);
    }
    @Test
    public void testTheFunctionOfPhoneWhenISNotValid(){
        String result = Phone.characters("2");
        assertEquals("Invalid input",result);
    }

    }



