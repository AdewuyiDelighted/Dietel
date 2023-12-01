package InterfaceAndAbstractionPratices.duck.girl;

public class Behaviours implements Boyfriend, Daddy {
    @Override
    public void spend() {
        System.out.println("boyfriend can spend o");

    }

    @Override
    public void care() {
        System.out.println("boyfriend cares o");

    }

    @Override
    public void godFearing() {
        System.out.println("boyfriend love God");

    }

    @Override
    public void handsome() {
        System.out.println("Boyfriend is hansome");

    }

    @Override
    public void pray() {
        System.out.println("Daddy prays");

    }

    @Override
    public void love() {
        System.out.println("Daddy loves me");

    }

    @Override
    public void payBills() {
        System.out.println("Daddy pays bills");

    }

    @Override
    public void alwaysHappy() {
        System.out.println("Daddy is always happy");

    }
}
