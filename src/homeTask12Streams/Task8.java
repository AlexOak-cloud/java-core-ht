package homeTask12Streams;

import homeTask12Streams.Lists.Employees;
import homeTask12Streams.Lists.People;
import homeTask12Streams.Lists.Students;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task8 {

    public static void main(String[] args) {
        int generalAge = generalAge(People.getPeopleList(),
                Students.getStudentsList(),
                Employees.getEmployeeList());
        System.out.println(generalAge);
    }

    public static int generalAge(List<Person> people , List<Student> students,List<Employee> employees) {
        List<Person> generalList = new ArrayList<>();
        generalList.addAll(people);
        generalList.addAll(students);
        generalList.addAll(employees);
        int generalAge = 0;
        for (Person tmp : generalList) {
            generalAge += LocalDate.now().getYear() - tmp.getBirthday().getYear();
        }
        return generalAge;
    }
}
