package FunctionInterfaceStream;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (number,numbers) -> number * numbers;{
            System.out.println(binaryOperator.apply(2,3));
        }
    }
}