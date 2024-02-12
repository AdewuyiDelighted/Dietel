package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileSampleTest {
    @Test
    public void testCreateFile() {
//        this link was gotten from the right clicking file directory copy path/reference then  abosolute path,paste add \\ then sample.txt
        String fileName = "sample.txt";
        String location = "C:\\Users\\Dell\\IdeaProjects\\Dietel\\files";

        FileSample.createFile(location, fileName);

        Path path = Paths.get(location, fileName);
        System.out.println(path);
        assertTrue(Files.exists(path));
    }
    @Test public void testCreateDirectory(){
        String location = "C:\\Users\\Dell\\IdeaProjects\\Dietel\\femi";
        FileSample.createDirectory(location);
        Path path = Path.of(location);
        assertTrue(Files.exists(path));
    }
    @Test public void testThatFolderCanBeDeleted(){
        String location = "C:\\Users\\Dell\\IdeaProjects\\Dietel\\femi";
        FileSample.deleteDirectory(location);

        Path path = Paths.get(location);

        assertFalse(Files.exists(path));
    }
    @Test public void testThatFileCanBeDeleted(){
        String fileName = "sample.txt";
        String location = "C:\\Users\\Dell\\IdeaProjects\\Dietel\\files";

        FileSample.deleteFile(location,fileName);

        Path path = Paths.get(location,fileName);

        assertFalse(Files.exists(path));
    }
}
