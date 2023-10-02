package Chapter3;

public class AirConditioner{

    private boolean isOn;
    private int temperature = 16;


   public void toggleOn(){

       isOn = !isOn;
   }
    public boolean isOn() {

       return isOn;
    }


    public int checkTemperature(){
       return temperature;
    }


    public void increaseTemperature() {
        if (temperature < 30) {
            temperature++;
             }

    }
    public void decreaseTemperature() {
       if (temperature < 16) {
           temperature--;
       }
       }
    }




