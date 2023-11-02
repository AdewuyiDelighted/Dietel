package Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AirplaneReservationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] planeSeats = new boolean[10];

        ArrayList<Integer> firstClassSeat = randomNumForFirstClassSeats();
        ArrayList<Integer> economyClassSeat = randomNumForEconomyClassSeats();

        String reservationSeat = "yes";


        print("Please type 1 for first class and please type 2 for economy");
        int classAnswer = scanner.nextInt();

        int firstCount = 0;
        int economyCount = 0;

        while (reservationSeat.equals("yes")) {

            if (classAnswer == 1) {

                if (firstCount <= 4) {

                    int seatNumbers = firstClassSeat.get(firstCount);
                    planeSeats[seatNumbers] = true;
                    System.out.printf("%s%d%s%n", "Your seat number is ", seatNumbers + 1, " in First Class");
                    firstCount++;
                } else {
                    print("""
                            We are sorry all the seat on first class has all been assigned,
                             enter yes if you would you like a seat in the economy class or
                            no if you dont want a seat in economy class""");
                    String firstAnswers = scanner.next();

                    if (firstAnswers.equals("yes")) {
                        System.out.println("Enter 2 to book a economy class");
                        classAnswer = scanner.nextInt();
                    } else if (firstAnswers.equals("no")) {
                        System.out.println("The next flight is taking off the next three hours");
                    }
                }
            }

            if (classAnswer == 2) {

                if (economyCount <= 4) {
                    int seatNumber = economyClassSeat.get(economyCount);
                    planeSeats[seatNumber] = true;
                    System.out.printf("%s%d%s%n", "Your seat number is ", seatNumber + 1, " in Economy Class");
                    economyCount++;
                } else {
                    print("We are sorry all the seat on first class has all been assigned,would you like a seat in the economy class");
                    String firstAnswers = scanner.next();

                    if (firstAnswers.equals("yes")) {
                        System.out.println("enter 1");
                        classAnswer = scanner.nextInt();
                    }
                    if (classAnswer == 1) {

                        if (firstCount <= 4) {

                            int seatNumbers = firstClassSeat.get(firstCount);
                            planeSeats[seatNumbers] = true;
                            System.out.printf("%s%d%s%n", "Your seat number is ", seatNumbers + 1, " in First Class");
                            firstCount++;
                        }
                    } else if (firstAnswers.equals("no")) {
                        System.out.println("The next flight is taking off the next three hours");
                    }
                }
            }

            if (firstCount > 4 && economyCount > 4) {
                System.out.println("We are sorry that all the seats are not available ");
            }

            print("Is there more seat reservation to be made ?,Enter yes  or no");
            reservationSeat = scanner.next();

            print("Please type 1 for first class and please type 2 for economy");
            classAnswer = scanner.nextInt();
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
