package InterfaceAndAbstractionPratices.duck.duck;

public class Duck {
    private Quackable quack;
    private Flyable fly;


    public Duck(Quackable choseYourQuack,Flyable choseYourFly){
        this.quack = choseYourQuack;
        this.fly = choseYourFly;
    }

    public void quack(){
        quack.quack();

    }

    public Quackable getQuack() {
        return quack;
    }

    public void setQuack(Quackable quack) {
        this.quack = quack;
    }

    public Flyable getFly() {
        return fly;
    }

    public void setFly(Flyable fly) {
        this.fly = fly;
    }

    public void fly(){
        fly.fly();
    }


}
