package Chapter3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    public static void main(String [] args){

        Clock clock = new Clock(14,53,13);

        clock.setHour(23);
        clock.setMinute(59);
        clock.setSecond(59);

        //System.out.println(clock.getHour()+":"+clock.getMinute()+":"+clock.getSecond());
        System.out.println(clock.getDisplayTime());



}
}