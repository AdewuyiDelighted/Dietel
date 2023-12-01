package InterfaceAndAbstractionPratices.duck.duck;

public class UrbanFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Tushish flying");
    }

    public static class UrbanQuack implements Quackable {
        @Override
        public void quack() {
            System.out.println("Quack tushishly");
        }
    }
}
