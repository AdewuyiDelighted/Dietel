import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    public static  void main(String [] args) {

        Bike bike = new Bike();

        bike.setName("toyota");
        bike.setOn(true);

        System.out.printf("%s%s%n" , "The name of the bike is ",bike.getName());
        System.out.printf("%s%b" , "Toyota is on: " ,bike.isOn());





    }


    }

