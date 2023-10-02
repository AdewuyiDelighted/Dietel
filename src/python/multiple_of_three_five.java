package python;



public class multiple_of_three_five {
    public static void main(String[] args) {
       for(int number = 1;number <= 50;number++){
          if(number % 3 == 0){
              System.out.println("Fuzz");
          }
          else if(number % 5 == 0){
               System.out.println("Buzz");
           }
          else{
              System.out.println(number);
          }
          if(number % 5 == 0 && number % 3 == 0){
              System.out.println("FizzBuzz");
          }
       }
                }
            }




