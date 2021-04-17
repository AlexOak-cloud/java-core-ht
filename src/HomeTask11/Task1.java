package HomeTask11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    private static List<String> list = new LinkedList<>();

    public static void main(String[] args) {
        list.add("qqq");
        list.add("www");
        list.add("eee");
        list.add("rrr");
        System.out.println(write(list));
    }

    private static <T> boolean write(List<T> list) {
        try (FileWriter fileWriter = new FileWriter("D:/JavaFiles/Task1.txt", false)) {
            for (Object temporary : list) {
                fileWriter.write(temporary + "\n");
            }
            return true;
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }
}
