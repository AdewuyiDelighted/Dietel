package PersonalAssessement;

public class OddEven {
    public static void main(String[] args) {
        int counter = 0;
        int odd = 0;
        int even = 0;
        int counterOne = 1;
        int counterTwo = 1;

       for(int num = 100; num <= 100; num++) {
            for (int numb = 1; numb <= 100; numb++) {
                counter++;
                System.out.print(counter + " ");
            }
            System.out.println(" ");
        }
        for (int numbee = 100; numbee <= 100; numbee++) {
            for ( int numbe = 0; numbe < 100; numbe++) {
              counterOne++;
              if(counterOne % 2 == 0) {
                    even = counterOne;
                  System.out.print(even + " ");
              }

            }
            System.out.println(" ");
        }
        for (int numberrr = 100; numberrr <= 100; numberrr++) {
            for (int numberr = 1; numberr < 100; numberr++) {
                counterTwo++;
                if (counterTwo % 2 == 1) {
                    odd = counterTwo;
                    System.out.print(odd+" ");
                }

            }
            System.out.println(" ");
        }
    }
}


