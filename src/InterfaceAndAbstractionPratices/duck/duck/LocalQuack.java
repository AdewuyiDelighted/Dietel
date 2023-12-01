package InterfaceAndAbstractionPratices.duck.duck;

public class LocalQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack locally !!!!!");
    }
}
