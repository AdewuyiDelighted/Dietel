
package Assignment;

import java.util.Scanner;

public class NokiaTest {





    public static void phoneBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1.Search
                2.Service Nos
                3.Add name
                4.Erase
                5.Edit
                6.Assign tone
                7.Send b`card
                8.Option
                9.Speed dial
                10.Voice tags
                11.MainMenu
                """);
        int enter = scanner.nextInt();
        switch (enter) {
            case 1: {
                System.out.println("Search");
                break;
            }
            case 2: {
                System.out.println("Service Nos");
                break;
            }
            case 3: {
                System.out.println("Add name");
                break;
            }
            case 4: {
                System.out.println("Erase");
                break;
            }
            case 5: {
                System.out.println("Edit");
                break;
            }
            case 6: {
                System.out.println("Assign Tone");
                break;

            }
            case 7: {
                System.out.println("Send b`card");
                break;
            }
            case 8: {
                System.out.println("""
                        1.Type of message
                        2.Mermory status
                        3.Back to menu
                        4. Go back 
                        5.main menu""");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Type of menu");
                        break;
                    case 2:
                        System.out.println("Mermory status");
                        break;
                    case 3:
                        System.out.println(enter);
                        break;
                    case 4:
                        System.out.println("Go back");
                        phoneBook();
                    case 5:
                        System.out.println("Main menu");
                        NokiaPhoneBook.mainMenu();
                }
             }
            case 9: {
                System.out.println("Speed dial");
                break;
            }
            case 10:
                System.out.println("Voice tags");
                break;

            case 11:
                NokiaPhoneBook.mainMenu();
                break;
        }
    }


    public static void messages() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1.Write Messages
                2.Inbox
                3.Outbox
                4.Picture Message
                5.Template
                6.Smileys
                7.Message Setting
                8.Info Services
                9.Voice mailbox Number
                10.Service Command editor
                11.Main menu
                """);
        int message = scanner.nextInt();
        switch (message) {
            case 1:
                System.out.println("Write Message");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture Messages");
                break;
            case 5:
                System.out.println("Template");
                break;
            case 6:
                System.out.println("Smiley");
            case 7:
                System.out.println("Message Setting");
                System.out.println("""
                        1.Set 1
                        2.Common
                        3.Go back
                        4.Main menu""");
                int setting = scanner.nextInt();
                switch (setting) {
                    case 1:
                        System.out.println("""
                                1.Message center number
                                2.Message sent as
                                3.Message validity
                                4.Go back
                                5.Main Menu""");
                        int settingTwo = scanner.nextInt();
                        switch (settingTwo) {
                            case 1:
                                System.out.println("Message center number");
                                break;
                            case 2:
                                System.out.println("Message sent as");
                                break;
                            case 3:
                                System.out.println("Message validity");
                                break;
                            case 4:
                                messages();
                            case 5:
                                NokiaPhoneBook.mainMenu();
                        }
                    case 2:
                        System.out.println("""
                                1.Delivery report
                                2.Reply via same center
                                3.Character support
                                4.Go back
                                5.Main menu""");
                        int common = scanner.nextInt();
                        switch (common) {
                            case 1:
                                System.out.println("Delivery report");
                                break;
                            case 2:
                                System.out.println("Reply via same setter");
                                break;
                            case 3:
                                System.out.println("Charater support");
                                break;
                            case 4:
                                messages();
                            case 5:
                                NokiaPhoneBook.mainMenu();
                        }
                    case 3:
                        messages();
                    case 4:
                        NokiaPhoneBook.mainMenu();

                }
            case 8:
                System.out.println("Info Services");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service Command editor");
                break;
            case 11:
                NokiaPhoneBook.mainMenu();


        }
    }

    public static void chat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1.Chat
                2.Main menu""");
        int chat = scanner.nextInt();
        switch (chat) {
            case 1:
                System.out.println("Chat");
                break;
            case 2:
                NokiaPhoneBook.mainMenu();
        }


    }

    public static void callRegister() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1.Missed calls
                2.Received calls
                3.Dialled numbers
                4.Erase recent call lists
                5.Show call duration
                6.Show call costs
                7.Call cost setting
                8.Prepaid credit
                9.Main menu""");
        int call = scanner.nextInt();
        switch (call) {
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dailled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                System.out.println("""
                        1.Last call duration
                        2.All calls cost
                        3.Received calls duration
                        4.Dialled calls duration
                        5.Clear timer
                        6.Go back
                        7.Main menu""");
                int callTwo = scanner.nextInt();
                switch (callTwo) {
                    case 1:
                        System.out.println("Last call duration");
                        break;
                    case 2:
                        System.out.println("All calls cost");
                        break;
                    case 3:
                        System.out.println("Received calls duration");
                        break;
                    case 4:
                        System.out.println("Dialled calls duration");
                        break;
                    case 5:
                        System.out.println("Clear timer");
                        break;
                    case 6:
                        callRegister();
                    case 7:
                        NokiaPhoneBook.mainMenu();


                }
            case 6:
                System.out.println("""
                        1.Last calls cost
                        2.All calls cost
                        3.Clear counter
                        4.Go back
                        5.main menu""");
                int callThree = scanner.nextInt();
                switch (callThree) {
                    case 1:
                        System.out.println("Last call cost");
                        break;
                    case 2:
                        System.out.println("All calls cost");
                        break;
                    case 3:
                        System.out.println("Clear counter");
                        break;
                    case 4:
                        callRegister();
                    case 5:
                        NokiaPhoneBook.mainMenu();


                }
            case 7:
                System.out.println("""
                        1.Calls limit
                        2.Show cost in
                        3.Go back
                        4.main menu""");
                int callFour = scanner.nextInt();
                switch (callFour) {
                    case 1:
                        System.out.println("Call limit "); break;

                    case 2:
                        System.out.println("Show cost in"); break;

                    case 3:
                        callRegister();
                    case 5:
                        NokiaPhoneBook.mainMenu();
                }

            case 8:
                System.out.println("Prepaid credits "); break;
            case 9:
                NokiaPhoneBook.mainMenu();


        }
    }
        public static void tones () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    1.Ringing tone
                    2.Ringing volume
                    3.Incoming call alert
                    4.Composer
                    5.Message alert tone
                    6.Keypad tones
                    7.Warning and game tones
                    8.Vibrating alert
                    9.Screen saver
                    10.Main menu
                    """);
            int tone = scanner.nextInt();
            switch (tone) {
                case 1:
                    System.out.println("Ringing tone");
                    break;

                case 2:
                    System.out.println("Ringing volume");
                    break;

                case 3:
                    System.out.println("Incoming call alert");
                    break;

                case 4:
                    System.out.println("Composer");
                    break;

                case 5:
                    System.out.println("Message alert tone");
                    break;

                case 6:
                    System.out.println("Keypad tones");
                    break;
                case 7:
                    System.out.println("Warning and game tones");
                    break;

                case 8:
                    System.out.println("Vibrating alert");
                    break;

                case 9:
                    System.out.println("Screen saver");
                    break;

                case 10:
                    NokiaPhoneBook.mainMenu();


            }
        }

        public static void setting () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                1.Call settings
                2.Phone setting
                3.Security settings
                4.Restore factory setting
                5.Main menu""");
            int setting  = scanner.nextInt();
            switch(setting){
                case 1:
                    System.out.println("""
                        1.Automatic dial
                        2.Speed dial
                        3.Call waiting option
                        4.Own number sending
                        5.Phone line in use
                        6.Automatic answer
                        7.Go back
                        8.Main menu""");
                    int settingTwo = scanner.nextInt();
                    switch (settingTwo){
                        case 1: {
                            System.out.println("Automatic dial");
                            break;
                        }
                        case 2: {
                            System.out.println("Speed dial");
                            break;
                        }
                        case 3: {
                            System.out.println("Call waiting option");
                            break;
                        }
                        case 4: {
                            System.out.println("Own number sending");
                            break;
                        }
                        case 5: {
                            System.out.println("Phone line in use");
                            break;
                        }

                        case 6: {
                            System.out.println("Automatic answer");
                            break;
                        }
                        case 7: {
                            setting();
                        }
                        case 8: {
                            NokiaPhoneBook.mainMenu();
                        }


                    }
                    break;
                case 2: {
                    System.out.println("""
                            1.Language
                            2.Cell info display
                            3.Welcome note
                            4.Network selection
                            5.Lights
                            6.Confirm SIM service actions
                            7.Go back
                            8.Main menu""");

                    int settingThree = scanner.nextInt();
                    switch (settingThree) {
                        case 1:
                            System.out.println("Language");
                            break;
                        case 2:
                            System.out.println("Cell info display");
                            break;
                        case 3:
                            System.out.println("Welcome note");
                            break;

                        case 4:
                            System.out.println("Network selection");
                            break;
                        case 5:
                            System.out.println("Lights");
                            break;

                        case 6:
                            System.out.println("Confirm SIM service actions");
                            break;
                        case 7:
                            setting();
                        case 8:
                            NokiaPhoneBook.mainMenu();

                    }

                    }
                case 3:
                    System.out.println("""
                        1.PIN code request
                        2.Call barring service
                        3.Fixed dialling
                        4.Closed user group
                        5.Phone security
                        6.Change access code
                        7.Go back
                        8.Main menu""");
                    int settingFour = scanner.nextInt();
                    switch (settingFour){
                        case 1:
                            System.out.println("PIN code request");break;
                        case 2:
                            System.out.println("Call barring service");break;
                        case 3:
                            System.out.println("Fixed dialling");break;

                        case 4:
                            System.out.println("Closed user group");break;
                        case 5:
                            System.out.println("Phone security");break;

                        case 6:
                            System.out.println("Change access code");break;
                        case 7:
                            setting();
                        case 8:
                            NokiaPhoneBook.mainMenu();


                    }
                case 4:
                    System.out.println("Restore factory setting "); break;
                case 5:
                    NokiaPhoneBook.mainMenu();

            }



        }

        public static void callDivert () {
        Scanner scanner = new Scanner (System.in);
            System.out.println("""
                    1.Call divert
                    2.Main menu""");
            int divert = scanner.nextInt();
            switch (divert){
                case 1:
                    System.out.println("Call divert"); break;
                case 2:
                    NokiaPhoneBook.mainMenu();
            }



        }

        public static void games () {
            Scanner scanner = new Scanner (System.in);
            System.out.println("""
                    1.Game
                    2.Main menu""");
            int game = scanner.nextInt();
            switch (game){
                case 1:
                    System.out.println("Game"); break;
                case 2:
                    NokiaPhoneBook.mainMenu();
            }

        }

        public static void calculator () {
            Scanner scanner = new Scanner (System.in);
            System.out.println("""
                    1.Calculator
                    2.Main menu""");
            int calculator = scanner.nextInt();
            switch (calculator){
                case 1:
                    System.out.println("Calculator"); break;
                case 2:
                    NokiaPhoneBook.mainMenu();
            }


        }

        public static void remainder () {
            Scanner scanner = new Scanner (System.in);
            System.out.println("""
                    1.Remainder
                    2.Main menu""");
            int Remainder = scanner.nextInt();
            switch (Remainder){
                case 1:
                    System.out.println("Remainder"); break;
                case 2:
                    NokiaPhoneBook.mainMenu();
            }



        }

        public static void clock () {
        Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    1.Alarm clock
                    2.Clock setting
                    3.Stop watch
                    4.Countdown timer
                    5.Auto update of date and time
                    6.Main menu""");
            int clock = scanner.nextInt();
            switch (clock){
                case 1:
                    System.out.println("Alarm clock"); break;
                case 2:
                    System.out.println("Clock setting"); break;
                case 3:
                    System.out.println("Stop watch"); break;
                case 4:
                    System.out.println("Countdown timer"); break;
                case 5:
                    System.out.println("Auto update of date and time"); break;
                case 6:
                    NokiaPhoneBook.mainMenu();


            }


        }

        public static void profiles () {
            Scanner scanner = new Scanner (System.in);
            System.out.println("""
                    1.Profile
                    2.Main menu""");
            int Profile = scanner.nextInt();
            switch (Profile){
                case 1:
                    System.out.println("Profile"); break;
                case 2:
                    NokiaPhoneBook.mainMenu();
            }


        }

        public static void simServices () {
            Scanner scanner = new Scanner (System.in);
            System.out.println("""
                    1.SIM service
                    2.Main menu""");
            int simService = scanner.nextInt();
            switch (simService){
                case 1:
                    System.out.println("simService"); break;
                case 2:
                    NokiaPhoneBook.mainMenu();
            }



        }
    }








































