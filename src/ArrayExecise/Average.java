package ArrayExecise;

public class Average {

    public static int average(int[] arrays) {
        int sum = 0;
        for (int array : arrays) {
            sum += array;
        }
        return sum / arrays.length;
    }

    public static double average(double[] arrays) {
        double sum = 0.0;
        for (double array : arrays) {
            sum += array;
        }
        return sum / arrays.length;
    }
}
