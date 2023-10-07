package ChapterSeven;

public class VariableLength {

    public static void main(String[] args) {
        System.out.println(averageOfSeries(1,2,3,4,5,6,7,8,9,10));
    }

public  static double averageOfSeries(int...numbers){
        int length = numbers.length;
        int sum = 0;
        double average = 0;
        for(int number : numbers){
            sum += number;
        }average = (double) sum /length;
            String averageToString = String.format("%.1f",average);
            double averageToDouble = Double.parseDouble(averageToString);
        return averageToDouble;
    }


}

