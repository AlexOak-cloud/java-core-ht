package homeTask12Streams;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {
        Employee minEmployee = task5MinSalary(PersonList.getList());
        System.out.println("Min salary : " + minEmployee);
        Employee maxEmployee = task5MaxSalary(PersonList.getList());
        System.out.println("Max salary : " + maxEmployee);


    }

    public static Employee task5MinSalary(List<Person> localList) {
        List<Employee> supportList = Task2.task2(localList);
        Optional<Employee> returning = supportList.stream().
                sorted(Comparator.comparing(o -> PersonList.intOfBD(o.getSalary()))).
                findFirst();

        Employee employee = returning.get();

        return employee;
    }

    public static Employee task5MaxSalary(List<Person> localList) {
        List<Employee> supportList = Task2.task2(localList);
        Optional<Employee> employee = supportList.stream().
                sorted(Comparator.comparing(o -> PersonList.intOfBD(o.getSalary()))).
                skip(supportList.size() - 1).
                findAny();

        Employee returning = employee.get();

        return returning;
    }
}


