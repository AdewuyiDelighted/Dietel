package Chapter4;

public class SalesCommissionCalculator {

private double sales;

    public int getWages() {
        return  200;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    public double getTotalCommission() {
        double commission = getWages()  + (9 * sales/100);
        return commission;
    }
}
