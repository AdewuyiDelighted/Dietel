package filesAndDirectorories;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream2 {
    public static void main(String[] args) {

        try (ObjectOutputStream objectOutputStreams = new ObjectOutputStream(System.out)) {
            User user = new User("Jide", 34);
            objectOutputStreams.writeObject(user);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
