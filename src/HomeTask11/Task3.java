package HomeTask11;

import jdk.management.resource.internal.WrapInstrumentation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

//Создать метод принимающий мапу Map<String,List<String>>
// .Это метод должен записать мапу в файлы.
// Навзание файла это ключ, содержимое это строки из листа
public class Task3 {

    private static File file;
    private static final String CATALOG_FILES = "D:/JavaFiles/Task3/%s";

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("qqq");
        list1.add("qqq");
        list1.add("qqq");
        map.put("File3_1.txt", list1);
        List<String> list2 = new ArrayList<>();
        list2.add("www");
        list2.add("www");
        list2.add("www");
        map.put("File3_2.txt", list2);
        List<String> list3 = new ArrayList<>();
        list3.add("eee");
        list3.add("eee");
        list3.add("eee");
        map.put("File3_3.txt", list3);

        System.out.println(files(map));


    }

    private static boolean files(Map<String, List<String>> map) {
        boolean succefully = false;
        for (Map.Entry<String, List<String>> temporary : map.entrySet()) {
            String nameFile = temporary.getKey();
            List<String> content = temporary.getValue();
            try (FileWriter fileWriter = new FileWriter(file, false)) {
                file = new File(String.format(CATALOG_FILES, nameFile));
                if (!file.exists()) {
                    file.createNewFile();
                }
                for (String trash : content) {
                    fileWriter.write(trash + "\n");
                }
                fileWriter.flush();
                succefully = true;
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                succefully = false;
            }
        }
        return succefully;
    }
}

