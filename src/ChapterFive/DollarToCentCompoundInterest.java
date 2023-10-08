package ChapterFive;

public class DollarToCentCompoundInterest {
    public static void main(String[] args) {
        int  principal = 1000;
        double rate = 0.05;
        System.out.printf("%s%20s%n","Year","Amount on deposit");
        for (int year = 1; year <= 10; year++) {
            int amount = (int) (principal * Math.pow(1.0 + rate, year));
            int overall = amount /100;
            int overallTwo = amount % 100;
            System.out.printf("%d%11s%d%s%d%n",year,"$", overall,".",overallTwo);
            }
            System.out.println();
        }

    }

