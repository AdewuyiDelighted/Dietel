package Chapter3;



public class CarTest {
    public static void main(String[] args) {

            Car car = new Car("toyota 2022", "2023", 5600
            );
            Car carTwo  = new Car("benz 234" , "2022" , 9000);




            car.setModel("toyota 565");
            car.setYear("2003");
            car.setPrice(5000, 5);

            carTwo.setModel("camry 323");
            carTwo.setYear("2024");
            carTwo.setPrice(9000,7);

            System.out.println(car.getModel());
            System.out.println(car.getYear());
            System.out.println(car.getPrice());
            System.out.println(" ");

        System.out.println(carTwo.getModel());
        System.out.println(carTwo.getYear());
        System.out.println(carTwo.getPrice());





        }
    }
