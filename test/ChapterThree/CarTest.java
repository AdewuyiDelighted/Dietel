package ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
@Test
    public void testThatCarModel(){
    Car car = new Car("Toyota" ,"2023",45000);
    car.setModel("Zuzuki");
    assertEquals("Zuzuki",car.getModel());
}
@Test
    public void testTheCarYear(){
    Car car = new Car("Toyota","2021",5000);
    car.setYear("2021");
    assertEquals("2021",car.getYear());
}
@Test
    public void testThePriceOfPriceOfCar(){
    Car car = new Car("Toyota","2023",3000);
    car.setCarOnePrice(4500);
    assertEquals(4275,car.getPrice());
    car.setCarTwoPrice(4500);
    assertEquals(4185,car.getPrice());
}

}