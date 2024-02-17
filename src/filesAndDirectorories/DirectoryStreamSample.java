package filesAndDirectorories;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamSample {
    public static void main(String[] args) {
        String location = "C:\\Users\\Dell\\IdeaProjects\\Dietel\\src\\mrjonathanExercise";
        Path path = Path.of(location);
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
            directoryStream.forEach(System.out::println);
//            (lamada)directoryStream.forEach(path1 -> System.out.println(path1)); this and the one above works the same way(reference method)
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
