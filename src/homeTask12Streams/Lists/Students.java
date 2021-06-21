package homeTask12Streams.Lists;

import homeTask12Streams.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Students {

    public static List<Student> getStudentsList() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(LocalDate.of(2000, Month.JANUARY, 25),
                "Gregory",
                "House",
                "4",
                1));
        list.add(new Student(LocalDate.of(1989, Month.AUGUST, 3),
                "Sasha",
                "Gray",
                "4",
                2));
        list.add(new Student(LocalDate.of(1999, Month.MARCH, 25),
                "Holly",
                "Hendrix",
                "4",
                3));
        return list;
    }
}
