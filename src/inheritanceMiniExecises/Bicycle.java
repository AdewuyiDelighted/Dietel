package inheritanceMiniExecises;

class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear,int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    @Override
    public String toString(){
        return ("No of gear are "+ gear +"\n" +"speed of bicycle is " + speed);
    }
}
