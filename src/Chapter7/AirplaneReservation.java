package Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AirplaneReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] planeSeats = new boolean[10];

        ArrayList<Integer> firstClassSeat = randomNumForFirstClassSeats();
        ArrayList<Integer> economyClassSeat = randomNumForEconomyClassSeats();

        String reservationSeat = "yes";
        String firstAnswer = "yess";


        int firstCount = 0;
        int economyCount = 0;
        int answer = 0;


        while (reservationSeat.equals("yes")) {

            print("Please type 1 for first class and please type 2 for economy");
            int classAnswer = scanner.nextInt();
            if (classAnswer == 1) {

                if (firstCount == 5) {
                    print("We are sorry all the seat on first class has all been assigned,would you like a seat in the economy class");
                    String firstAnswers = scanner.next();
                    if (firstAnswers.equals(firstAnswer)) {
                        System.out.println("enter 2");
                        answer = scanner.nextInt();
                    }
                }
                int seatNumbers = firstClassSeat.get(firstCount);
                planeSeats[seatNumbers] = true;
                System.out.printf("%s%d%s%n", "Your seat number is ", seatNumbers + 1, " in First Class");
                print(Arrays.toString(planeSeats));
                firstCount++;

            } else if (classAnswer == 2 || answer == 2) {

                int seatNumber = economyClassSeat.get(economyCount);
                planeSeats[seatNumber] = true;
                System.out.printf("%s%d%s%n", "Your seat number is ", seatNumber + 1, " in Economy Class");
                print(Arrays.toString(planeSeats));
                economyCount++;
            }
            print("Is there more seat reservation to be made ?,Enter yes  or no");
            reservationSeat = scanner.next();
        }
        print(Arrays.toString(planeSeats));

    }










    private static ArrayList<Integer> randomNumForFirstClassSeats() {
        ArrayList<Integer> firstClassSeats = new ArrayList<>();
        for (int index = 0; index < 5; index++) {
            firstClassSeats.add(index);
        }
        Collections.shuffle(firstClassSeats);
        return firstClassSeats;
    }






    private static ArrayList<Integer> randomNumForEconomyClassSeats() {
        ArrayList<Integer> economyClassSeats = new ArrayList<>();
        for (int index = 5; index < 10; index++) {
            economyClassSeats.add(index);
        }
        Collections.shuffle(economyClassSeats);
        return economyClassSeats;
    }

    private static void print(String input) {
        System.out.println(input);
    }


}
