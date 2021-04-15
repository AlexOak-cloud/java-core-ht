package HomeTask11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    private static final String FILE_PATH = "D:/JavaFiles/Task1.txt";
    private static List<String> list = new LinkedList<>();
    private static Writer fileWriter;

    public static void main(String[] args) {
        list.add("qqq");
        list.add("www");
        list.add("eee");
        list.add("rrr");
        System.out.println(write(list, FILE_PATH));
    }

    private static <T> boolean write(List<T> list, String fileName) {
        boolean returning = false;
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(fileName, false);
            for (Object temporary : list) {
                fileWriter.write(temporary + "\n");
            }
            returning = true;
        } catch (IOException ex) {
            returning = false;
            System.err.println(ex.getMessage());
        } finally {
            try {
                fileWriter.flush();
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return returning;
    }
}
