package FunctionInterfaceStream;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        //extends Function functional interface buh it takes one parameter and returns the type of the parameter

        UnaryOperator<String> operator = (word) -> new StringBuilder(word).reverse().toString();
        System.out.println(operator.apply("Whose"));
    }

}
