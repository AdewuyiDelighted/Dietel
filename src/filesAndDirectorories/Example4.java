package filesAndDirectorories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) throws FileNotFoundException {
        String location = "C:\\Users\\Dell\\IdeaProjects\\HCFCalculator\\src\\hcfCaculator\\HCF.java";
        InputStream stream = new FileInputStream(location);
        Scanner scanner = new Scanner(stream);
        System.out.println(scanner.nextLine());
    }
}
