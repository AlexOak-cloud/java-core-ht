package HomeTask11;

import java.io.*;
import java.util.Scanner;

//1 Прочитать первую строку и взять оттуда название файла(после “filename: ”)
// 2 Взять из второй строки контент (после “content:”)
// 3 Сохранить контен в файл с названием, взятым из файл
public class Task2 {
    private static final String FILE_PATH = "D:/JavaFiles/Task2/File1.txt";
    private static File file;
    private static final String FILE_CATALOG = "D:/JavaFiles/Task2/%s";

    public static void main(String[] args) {
        System.out.println(createNewFile(readName(), readContent()));
    }

    public static String readName() {
        String name = "";
        try (FileReader fileReader = new FileReader(FILE_PATH)) {
            Scanner scanner = new Scanner(fileReader);
            name = scanner.nextLine();
            name = name.substring(10);
            scanner.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return name;
    }

    private static String readContent() {
        String content = "";
        try (FileReader fileReader = new FileReader(FILE_PATH)) {
            Scanner scanner = new Scanner(fileReader);
            content = scanner.nextLine();
            content = scanner.nextLine();
            content = content.substring(9);
            scanner.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return content;
    }

    private static boolean createNewFile(String nameFile, String content) {
        try (FileWriter fileWriter = new FileWriter(file, false)) {
            file = new File(String.format(FILE_CATALOG, nameFile));
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter.write(content);
            fileWriter.flush();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
