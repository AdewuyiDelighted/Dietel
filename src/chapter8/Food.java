package chapter8;

import java.util.Arrays;

public enum Food {
    APPLE("Fruit", "95%"),
    BANANA("Fruit", "72% - 175%"),
    CARROT("Vegetable", "25%");
    private String type;
    private String numberOfCalories;

    Food(String type, String numberOfCalories) {
        this.type = type;
        this.numberOfCalories = numberOfCalories;
    }

    public String getType() {
        return type;
    }

    public String getNumberOfCalories() {
        return numberOfCalories;
    }


}
