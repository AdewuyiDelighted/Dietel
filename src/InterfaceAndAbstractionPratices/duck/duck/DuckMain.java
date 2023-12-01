package InterfaceAndAbstractionPratices.duck.duck;

public class DuckMain {
    public static void main(String[] args) {
        Flyable localFly = new LocalFly();
        Flyable tush = new UrbanFly();
        Quackable localQ = new LocalQuack();
        Quackable tushQ = new UrbanFly.UrbanQuack();

        Duck duck =  new Duck(localQ, localFly);
        Duck secondDuck = new Duck(tushQ, tush);
            duck.fly();
            duck.quack();
            secondDuck.fly();
            secondDuck.quack();
    }
}

