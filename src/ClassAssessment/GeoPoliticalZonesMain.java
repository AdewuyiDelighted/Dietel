package ClassAssessment;

import java.util.Scanner;

public class GeoPoliticalZonesMain {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your state");
        String userState = scanner.nextLine();
        for(GeoPoliticalZones zones : GeoPoliticalZones.values()){
            for(int index = 0; index < zones.getStates().length;index++){
                if(zones.getStates()[index].equals(userState)){
                    System.out.println(zones);
                }
            }
        }

    }
}
