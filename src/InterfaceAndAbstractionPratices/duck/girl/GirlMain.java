package InterfaceAndAbstractionPratices.duck.girl;

public class GirlMain {
    public static void main(String[] args) {
        Boyfriend herBoyfriend = new Behaviours();
        Daddy myDaddy = new Behaviours();
        Girl girl = new Girl(herBoyfriend, myDaddy);
        girl.happy();
        girl.heCares();
        girl.heFearsGod();
        girl.love();
        girl.payBills();
        girl.heCares();
        girl.happy();
        girl.hisLook();
    }
}