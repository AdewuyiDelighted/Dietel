package PersonalAssessement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Press
                1 --> English
                2 --> Yoruba
                3 --> Pidgin
                """);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("English");
            {
                System.out.println("""
                        Enter 1 if you want to continue to speak English
                        Enter 2 if you want to stop speaking English""");
                int english = scanner.nextInt();
                switch(english){
                    case 1:
                        System.out.println("Welcome,we are please to meet you"); break;
                    case 2:
                        System.out.println("please you may take your leave"); break;

                }
                  break;
            }
            case 2 :
                System.out.println("Yoruba");
            {
                System.out.println("o fe so yoruba abi ? te 1 fun beni abi te 2 fun rara");
                int yoruba = scanner.nextInt();
                switch (yoruba) {
                    case 1:
                        System.out.println("ka re omo yoruba dada");break;
                    case 2:
                        System.out.println("o da bo omo ale");break;

                }
                    break;
            }

            case 3 :
                System.out.println("pidgin");
            {
                System.out.println("""
                        you wan speak pidgin? 
                        make you enter  1 if naso 
                        make you press 2 if no be so""");
                int pidgin = scanner.nextInt();
                switch (pidgin) {
                    case 1:
                        System.out.println("Weldone done better pikin"); break;
                    case 2:
                        System.out.println("commot for here jare"); break;
                }
            break;
            }
        }
    }

}

