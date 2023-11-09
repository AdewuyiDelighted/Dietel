package inheritanceMiniExecises;

public class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight, int bikeNumber) {
        super(gear, speed, bikeNumber);
        seatHeight = startHeight;

    }

    @Override
    public void applyBrake(int decrement) {
        speed += decrement;

    }
    public int getApplyBrake(){
        return speed;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }


}
