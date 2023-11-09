package inheritanceMiniExecises;

public class BicycleTest {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(3,6,2,1);
        mountainBike.applyBrake(3);
        System.out.println(mountainBike.getApplyBrake());
        System.out.println(mountainBike.toString());

    }
}
