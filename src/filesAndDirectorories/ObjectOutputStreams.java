package filesAndDirectorories;

import java.io.*;
import java.math.BigDecimal;

public class ObjectOutputStreams {
    public static void main(String[] args) throws FileNotFoundException {
        String error = "C:\\Users\\Dell\\IdeaProjects\\Dietel\\files\\error.txt";
        try (ObjectOutputStream outputStream = new ObjectOutputStream(System.out)) {
            Transaction transaction = new Transaction("Tobi", "Ope", BigDecimal.valueOf(400).toString());
            outputStream.writeObject(transaction);
        } catch (IOException exception) {
            PrintStream printStream = new PrintStream(new FileOutputStream(error)); // send the error message to an erroe text file  youcan alsoe implement serelizable
            System.setErr(printStream);
//            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
