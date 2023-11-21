package ClassAssessment;

import java.util.Arrays;

public enum GeoPoliticalZones {
    NORTHCENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST("Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamafara"),
    SOUTHEAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTHSOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTHWEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");
    private String[] states;

    GeoPoliticalZones(String... states) {
        this.states = states;
    }
    public String[] getStates() {
        return states;
    }

    public static void setInput() {
        System.out.println(Arrays.toString(GeoPoliticalZones.values()));
    }






}