package homeTask12Streams;

import javafx.geometry.Pos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class PersonList implements Positions{



    public static List<Person> getList() {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Student(LocalDate.of(1980, Month.JULY, 5),
                "Andry",
                "Johbs",
                "12",
                4));
        listPerson.add(new Student(LocalDate.of(2001, Month.JULY, 7),
                "Stan",
                "Colt",
                "13",
                5));
        listPerson.add(new Student(LocalDate.of(2000, Month.JANUARY, 25),
                "Gregory",
                "House",
                "4",
                1));
        listPerson.add(new Employee(LocalDate.of(1985, Month.JULY, 5),
                "Klava",
                "Koka",
                BigDecimal.valueOf(1100),
                Positions.enginer));
        listPerson.add(new Employee(LocalDate.of(1979, Month.JULY, 5),
                "sadf",
                "asdf",
                BigDecimal.valueOf(900),
                Positions.laborant));
        listPerson.add(new Employee(LocalDate.of(1990, Month.JANUARY, 5),
                "John",
                "Johbs",
                BigDecimal.valueOf(1600),
                Positions.manager));
        listPerson.add(new Employee(LocalDate.of(1980, Month.JANUARY, 5),
                "John",
                "Mahoney",
                BigDecimal.valueOf(1400),
                Positions.enginer));

        return listPerson;
    }

    public static <T> String showList(List<T> list) {
        String returning = "";
        for (Object tmp : list) {
            returning += tmp + "\n";
        }
        return returning;
    }

    public static int intOfBD(BigDecimal bigDecimal){
        return bigDecimal.intValue();
    }

}
