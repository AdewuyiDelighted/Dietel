package Chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetrolPurchaseNewTest {
    private final PetrolPurchaseNew petrolPurchaseNew = new PetrolPurchaseNew("Yaba", "Diesel", 5, 600.4, 5.0);

@Test
    public void testTheLocationOfPetroStation(){
    petrolPurchaseNew.setStationLocation("Yaba");
    assertEquals("Yaba",petrolPurchaseNew.getStationLocation());

}
@Test
    public void testTheTypeOfPetrol(){
    petrolPurchaseNew.setType("Petrol gangan");
    assertEquals("Petrol gangan",petrolPurchaseNew.getType());
}
@Test
    public void testTheQuantityOfPetrol(){
    petrolPurchaseNew.setQuantity(10);
    assertEquals(10,petrolPurchaseNew.getQuantity());
}
@Test
    public void testThePriceOfPetrol(){
    petrolPurchaseNew.setPrice(500);
    assertEquals(500,petrolPurchaseNew.getPrice());
}
@Test
    public void testTheDiscountOnPetrol(){
    petrolPurchaseNew.setPercentageDiscount(5);
    assertEquals(0.05,petrolPurchaseNew.getPercentageDiscount());
}
@Test
    public void testTheTotalAmountofPetrol(){
    petrolPurchaseNew.setPrice(500);
    petrolPurchaseNew.setQuantity(5);
    petrolPurchaseNew.setPercentageDiscount(34);
    petrolPurchaseNew.getPurchaseAmount();
    assertEquals(1650,petrolPurchaseNew.getPurchaseAmount());

}
}