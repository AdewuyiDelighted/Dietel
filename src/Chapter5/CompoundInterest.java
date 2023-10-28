package Chapter5;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        System.out.printf("%s%9s%9s%9s%9s%9s%10s%n","Year","5% Rate","6% Rate","7% Rate","8% Rate","9% Rate","10% Rate");
        for(int year = 1;year <= 10;year++){
            for(double interest = 0.05;interest <=0.1;interest+=0.01){
                double amount = principal * Math.pow(1.0 + interest,year);
                System.out.printf("%10.2f",amount);
            }
            System.out.println();
        }
    }
}
