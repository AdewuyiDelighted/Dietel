package PersonalAssessement;

import java.util.Scanner;

public class SwitchOne {
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
                System.out.println("English"); break;
            case 2 :
                System.out.println("Yoruba"); break;
            case 3 :
                System.out.println("pidgin"); break;
        }
    }

}
