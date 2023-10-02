package PersonalAssessement;

import java.util.Scanner;

public class Nokiaaa {

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(""" 
                                 
                1.PhoneBook
                2.Messages
                3.Chat
                4.Call Register
                5.Tones
                6.Settings""");
        int mainMenu = scanner.nextInt();
        switch (mainMenu) {
            case 1:
                System.out.println("Phone book");
            case 2:
                System.out.println("Messages");
            case 3:
                System.out.println("Chat");
            case 4:
                System.out.println("Call register");
            case 5:
                System.out.println("Tones");
            case 6:
                System.out.println("Settings");

        }
    }
                public static void phoneBook() {
                    Scanner scanner = new Scanner(System.in);
                System.out.println("""
                 1.Search
                2.Service Nos
                3.Add name
                4.Erase
                5.Edit
                6.Assign tone
                7.mainMenu
                        """);
                int phoneBook = scanner.nextInt();
                switch(phoneBook){
                    case 1:
                        System.out.println("Search");
                    case 2:
                        System.out.println("Service nos");
                    case 3:
                        System.out.println("Add name");
                    case 4:
                        System.out.println("Erase");
                    case 5:
                        System.out.println("Edit");
                    case 6:
                        System.out.println("ASssign tone");
                    case 7:
                        mainMenu();

                }

            }
        }

