import static org.junit.jupiter.api.Assertions.*;

class PetrolPurchaseTwoTest {

        public static void main(String [] args){


            PetrolPurchaseTwo petrol = new PetrolPurchaseTwo("Lagos" ,"pentrol", 10 , 200, 5 );


            double netAmount = petrol.getPurchaseAmount(200 , 10 , 5 );

            System.out.println(petrol.getLocation());
            System.out.println(petrol.getType());
            System.out.println(petrol.getQuantity());
            System.out.println(petrol.getPrice());
            System.out.println(petrol.getDiscount());
            System.out.println(netAmount);



        }
    }


