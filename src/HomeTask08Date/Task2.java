package HomeTask08Date;

//2 Вывести на консоль текущую дату в формате YYYY-MM-DD

import java.time.LocalDate;
import java.util.Calendar;

public class Task2 {

    public static LocalDate localDate = LocalDate.now();

    public static void main(String[] args) {
        System.out.println(localDate);
    }
}
