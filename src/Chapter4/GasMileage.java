package Chapter4;

public class GasMileage {


    private int miles;
    private int gallons;
    private double total;
    private double combinedMiles;


    public void miles(int mile) {
        this.miles = mile;
    }
    public int getMiles(){
        return  miles;
    }
    public void gallons(int liter){
        this.gallons = liter;
    }
    public int getGallons() {
        return gallons;
    }

    public void setMilePerGallon() {
        combinedMiles = (double) miles/ gallons;
    }

    public double getMilesPerGallons() {
       return combinedMiles;
    }
    public void  setCombinedMilesPerGallons() {
        total += getMilesPerGallons();
    }
    public  double getCombinedMilesPerGallons(){
        return total;
    }
}

