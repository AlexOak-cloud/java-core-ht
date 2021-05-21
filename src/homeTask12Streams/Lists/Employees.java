package homeTask12Streams.Lists;

import homeTask12Streams.Employee;
import homeTask12Streams.Positions;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Employees {

    public static List<Employee> getEmployeeList() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(LocalDate.of(1980, Month.JULY, 5),
                "Marsha",
                "May",
                BigDecimal.valueOf(900),
                Positions.laborant));
        list.add(new Employee(LocalDate.of(1972, Month.JULY, 27),
                "Mia",
                "Khalifa",
                BigDecimal.valueOf(900),
                Positions.laborant));
        list.add(new Employee(LocalDate.of(1990, Month.JANUARY, 5),
                "Dackota",
                "Skye",
                BigDecimal.valueOf(900),
                Positions.laborant));
        return list;

    }
}
