package Assignment;

import java.util.Scanner;

public class NokiaPhoneBook {
    public static void main(String[] args) {
        mainMenu();


    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 
                 1.PhoneBook
                 2.Messages
                 3.Chat
                 4.Call Register
                 5.Tones
                 6.Settings
                 7.Call divert
                 8.Games
                 9.Calculator
                10.Reminder
                11.Clock
                12.Profile
                13.SIM services""");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1: {
                System.out.println("PhoneBook");
                NokiaTest.phoneBook();
                break;
            }
            case 2: {
                System.out.println("Messages");
                NokiaTest.messages();
                break;
            }
            case 3: {
                System.out.println("Chat");
                NokiaTest.chat();
                break;

}
            case 4: {
                System.out.println("Call Register");
                NokiaTest.callRegister();
                break;
            }
            case 5:
                System.out.println("Tone");
                NokiaTest.tones();
                break;
            case 6:
                System.out.println("Settings");
                NokiaTest.setting();
                break;
            case 7:
                System.out.println("Call divert");
                NokiaTest.callDivert();
                break;
            case 8:
                System.out.println("Games");
                NokiaTest.games();
                break;
            case 9:
                System.out.println("Calculator");
                NokiaTest.calculator();
                break;
            case 10:
                System.out.println("Reminder");
                NokiaTest.remainder();
                break;
            case 11:
                System.out.println("Clock");
                NokiaTest.clock();
                break;
            case 12:
                System.out.println("Profile");
                NokiaTest.profiles();
                break;
            case 13:
                System.out.println("SIM services");
                NokiaTest.simServices();
                break;

        }
    }
}




