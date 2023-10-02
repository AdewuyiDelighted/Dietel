
package PersonalAssessement;

public class TaxCalculator {


    private String name;
    private int earnings;

    ;

    public void citizenName(String name) {
        this.name = name;
    }

    public String citizenNameN() {
        return name;
    }

    public void  citizenEarning(int amount) {
        this.earnings = amount;
    }

    public int citizenEarningE() {
        return earnings;
    }

    public int totalTax() {
        if (earnings <= 30000) {
            int total = earnings - (15 * earnings / 100);
            return total;
        } else {
            int total = earnings - (20 * earnings / 100);
            return total;
        }
    }

}





