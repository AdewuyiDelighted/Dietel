package FunctionInterfaceStream;

import java.util.function.LongToDoubleFunction;

public class LongDoubleFunctionSample {
    public static void main(String[] args) {
        LongToDoubleFunction longToDoubleFunction = (height) -> height * 2;

        System.out.println(longToDoubleFunction.applyAsDouble(45L));
    }
}
