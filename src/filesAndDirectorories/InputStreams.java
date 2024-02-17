package filesAndDirectorories;

import java.io.IOException;

public class InputStreams {
    public static void main(String[] args) {
//InputStreams
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream("C:\\Users\\Dell\\IdeaProjects\\Dietel\\files\\exmple.txt")) {
            byte[] filesByte = fileInputStream.readAllBytes();
            System.out.println(new String(filesByte));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
