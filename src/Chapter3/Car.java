package Chapter3;

public class Car {
    private String model;
    private String year;
    private double price;


    public  Car(String model, String year, int price) {


        this.model = model;
        this.year = year;
        this.price = price;
    }


        public void setModel(String model){

        this.model = model;
        }

            public void setYear(String year){

        this.year = year;
            }
            public void setPrice(int price , double discount ) {
                double totalPrice = price - (price * discount / 100);
                this.price = totalPrice;

            }

           public String getModel(){

        return model;
        }
        public String getYear(){
            return year;
        }

        public double getPrice(){

        return price;
        }


        }











