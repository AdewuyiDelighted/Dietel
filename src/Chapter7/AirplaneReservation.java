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


        int firstCount = 0;
        int economyCount = 0;



        while (reservationSeat.equals("yes")) {
            print("Please type 1 for first class and please type 2 for economy");
            int classAnswer = scanner.nextInt();
            if (classAnswer == 1) {

                int seatNumbers = firstClassSeat.get(firstCount);
                planeSeats[seatNumbers] = true;
                System.out.printf("%s%d%s%n", "Your seat number is ", seatNumbers + 1, " in First Class");
                System.out.println(Arrays.toString(planeSeats));

            } else if (classAnswer == 2) {

                int seatNumber = economyClassSeat.get(economyCount);
                planeSeats[seatNumber] = true;
                System.out.printf("%s%d%s%n", "Your seat number is ", seatNumber + 1, " in Economy Class");
                System.out.println(Arrays.toString(planeSeats));
            }
            print("Is there more seat reservation to be made ?,Enter yes  or no");
            reservationSeat = scanner.next();
            firstCount++;
            economyCount++;
        }
        System.out.println(Arrays.toString(planeSeats));

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
