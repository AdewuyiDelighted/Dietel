package chapter8;

import java.util.Arrays;

public class FoodMain {
    public static void main(String[] args) {
        for (Food food : Food.values()) {
            System.out.println(food + " " + food.getType() + " " + food.getNumberOfCalories());
        }
    }

}
