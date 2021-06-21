package homeTask12Streams.Lists;

import homeTask12Streams.Employee;
import homeTask12Streams.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class People {

    public static List<Person> getPeopleList() {
        List<Person> list = new ArrayList<>();
        list.add(new Person(LocalDate.of(1980, Month.JANUARY, 5),
                "John",
                "Johbs"
        ));
        list.add(new Person(LocalDate.of(1999, Month.JANUARY, 6),
                "Hleb",
                "Gleb"
        ));
        list.add(new Person(LocalDate.of(2015, Month.MARCH, 15),
                "Tonny",
                "Stathem"
        ));
        return list;
    }
}
