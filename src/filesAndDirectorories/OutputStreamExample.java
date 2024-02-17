package filesAndDirectorories;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\Dietel\\files\\exmple.txt")){
            String data = "Up nepa!";
            byte [] bytes = data.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.write(bytes,2,5);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
