package ChapterFour;

public class GasMileage {


    private int miles;
    private int gallons;
    private double total;
    private int combinedMiles;


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

    public int milesPerGallons() {
        int total =  miles/gallons;
        return total;
    }
    public int combinedMilesPerGallons(){
        int count = 1;
        count +=milesPerGallons();
        return count;
    }
}

