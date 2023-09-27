package ChapterThree;

public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int quantity;
    private double petrolPrice;
    private double discount;

    public void setStationLocation(String location) {
        this.stationLocation = location;

    }
    public String getStationLocation(){
        return stationLocation;
    }
    public void setTypeOfPetrol(String petrolType) {
        this.typeOfPetrol = petrolType;
    }

    public String getPetrolPurchase() {
        return typeOfPetrol;
    }
    public void setQuantity(int liters){
        quantity = liters;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPetrolPrice(double price) {
        petrolPrice = price;
    }
    public double getPetrolPrice(){
    return petrolPrice;
    }
    public void setDiscount(double discount){
        this.discount = petrolPrice - discount/100;
    }
    public double getDiscount(){
        return discount;
    }
    public void setPurchaseAmount() {
        this.petrolPrice = quantity * petrolPrice - discount;

    }
    public double getPurchaseAmount(){
        return petrolPrice;
    }


}

