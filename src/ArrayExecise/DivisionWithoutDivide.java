package ArrayExecise;

public class DivisionWithoutDivide {
    public static void main(String[] args) {
        System.out.println(divide(10, 3));

    }
    public static int divide(int dividend,int divisor){
        if(dividend == - 2147483648 && divisor == -1) return Integer.MAX_VALUE;
        int div = dividend/divisor;
        System.out.println(div);
        return div;
    }
}
