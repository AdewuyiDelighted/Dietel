import java.util.Scanner;

public class DaysWeek{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today  date: ");
        int date = scanner.nextInt();
        System.out.println("Enter future days");
        int future = scanner.nextInt();
        switch(date) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
                switch(future){
                case 0:
                    System.out.println("Sunday"); break;
                case 1:
                    System.out.println("Monday"); break;
                case 2:
                    System.out.println("Tuesdays"); break;
                case 3:
                    System.out.println("Wednesday"); break;
                case 4:
                    System.out.println("Thurdays"); break;
                case 5:
                    System.out.println("Friday"); break;
                case 6:
                    System.out.println("Satuday"); break;
            }

            }

        }



