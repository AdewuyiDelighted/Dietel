package filesAndDirectorories;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileOutStreams {
    public static void main(String[] args) throws FileNotFoundException {
        String location = "C:\\Users\\Dell\\IdeaProjects\\Dietl\\files\\exmple.txt";
        String errors = "C:\\Users\\Dell\\IdeaProjects\\Dietel\\files\\error.txt";
        try (PrintStream output = new PrintStream(new FileOutputStream(location))) {
            System.setOut(output);
            System.out.println("Hello everybody,Hope you are doing fine");
        } catch (FileNotFoundException exception) {
            System.out.println("Error");
            PrintStream errorStream = new PrintStream((new FileOutputStream(errors)));
            System.setErr(errorStream);
            throw new RuntimeException(exception);
        }
    }
}
