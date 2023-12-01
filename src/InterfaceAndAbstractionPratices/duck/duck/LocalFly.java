package InterfaceAndAbstractionPratices.duck.duck;

import InterfaceAndAbstractionPratices.duck.duck.Flyable;

public class LocalFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Fly locally");
    }
}
