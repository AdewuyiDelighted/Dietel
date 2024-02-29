package FunctionInterfaceStream;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IntStreams {
    public static void main(String[] args) {
        IntConsumer intStreamConsumer = (x) -> {
        };
        IntStream.range(1, 10).forEach(intStreamConsumer);
        {
            System.out.println(intStreamConsumer);
        }


        IntStream.range(1, 10).forEach(x -> System.out.println(x));  // this way is using lamda for the IntConsumer
    }




}

