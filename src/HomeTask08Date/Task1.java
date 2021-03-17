package HomeTask08Date;

//1 Получить текущую дату, ввести с консоли количество дней
// с начала года, прибавить эти дни ктекущей дате
// , вывести получившуюся дату

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static Date date = new Date();
    public static LocalDate localDate = LocalDate.now();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Текущая дата: ");
        System.out.println(localDate);
        System.out.println("Введите колличетсво дней с нового года");
        int userResponse = scanner.nextInt();
        System.out.print("Ответ: ");
        System.out.println(localDate.plusDays(userResponse));


    }
}
