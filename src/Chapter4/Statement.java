package Chapter4;

public class Statement {
    public static void main(String[] args) {
        int numberX = 5;
      int sum = numberX += numberX++ - 5;
        System.out.println(sum);
    }
}
