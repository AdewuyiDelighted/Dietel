package PersonalAssessement;

public class MultiThread extends Thread {
    @Override
    public void run(){
        for(int index = 0; index < 10;index++){
            System.out.print("=");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
