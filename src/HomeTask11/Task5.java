package HomeTask11;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Task5 {

    private static final String FILE_PATH = "D:/JavaFiles/Task5/File_Name.txt";

    public static void main(String[] args) {
        System.out.println(readFile(FILE_PATH));
    }

    public static String readFile(String fileName) {
        String returning = "";
        try (FileReader reader = new FileReader(fileName)) {
            int i;
            while ((i = reader.read()) != -1) {
                returning += (char) i;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return returning;
    }
}



