package FunctionInterfaceStream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        // Consumer is a functional interface,That collect a parameter and returns nothing example below

        Consumer<String> consumer = (name) -> System.out.println(name + " thinks wild");
        consumer.accept("Tolu");

//    BiConsumer is a functional interface that takes in two parameter and returns nothing
        BiConsumer<Integer, String> biConsumer = (age, month) -> System.out.println("She is " + age + " years old born in " + month);
        biConsumer.accept(56,"March");
    }

}
