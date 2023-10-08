package Chapter3;



public class PetrolPurchaseMain {
    public static void main(String[] args) {

        PetrolPurchaseNew petrol = new PetrolPurchaseNew("Yaba","petrol gangan", 5, 200.90,23.2);

        petrol.setStationLocation("Sango");
        petrol.setType("fuel");
        petrol.setQuantity(5);
        petrol.setPrice(500);
        petrol.setPercentageDiscount(34);


        System.out.println(petrol.getStationLocation());
        System.out.println(petrol.getType());
        System.out.println(petrol.getQuantity());
        System.out.println(petrol.getPrice());
        System.out.println(petrol.getPercentageDiscount());

        System.out.println(petrol.getPurchaseAmount());


    }

}