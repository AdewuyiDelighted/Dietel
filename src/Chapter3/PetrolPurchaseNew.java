package Chapter3;

public class PetrolPurchaseNew {

    private String stationLocation;
    private String type;
    private int quantity;
    private double price;
    private double percentageDiscount;


    public PetrolPurchaseNew(String stationLocation, String type , int quantity, double price , double percentageDiscount
    ){
        this.stationLocation = stationLocation;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.percentageDiscount =  percentageDiscount;


    }






    public void setStationLocation(String location) {

        this.stationLocation = location;
    }
    public String getStationLocation(){
        return stationLocation;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public double getPrice (){
        return price;
    }

    public void setPercentageDiscount(int discount){
        this.percentageDiscount = (double) discount/100;

    }
    public double getPercentageDiscount(){
        return percentageDiscount;
    }
    public double getPurchaseAmount(){
        int amount = (int) (price * quantity);
        return  amount - (amount * percentageDiscount);
    }
}
