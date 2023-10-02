package Chapter3;

public class Bike {
    private boolean isOn;
    private int accelerate;



    public void kickStart() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }


    public void increaseAccelerate() {
        if (accelerate < 20) {
            accelerate = accelerate +1;

        }
            else if(accelerate >= 20 && accelerate < 30){
                accelerate = accelerate +2;
            }
            else if (accelerate >= 30 && accelerate <= 40) {
                accelerate = accelerate + 3;

        }
            else{
                accelerate = accelerate + 4;
        }
        }


    public void decreaseAccelerate() {
        if (accelerate < 20) {
            accelerate = accelerate -1;

        }
        else if(accelerate >= 20 && accelerate < 30){
            accelerate = accelerate -2;
        }
        else if (accelerate >= 30 && accelerate <= 40) {
            accelerate = accelerate -3;

        }
        else{
            accelerate = accelerate -4;
        }
    }




    public int checkAccelerate(){
        return accelerate;
    }
}

