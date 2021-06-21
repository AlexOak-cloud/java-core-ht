package homeTask12Streams;

import homeTask12Streams.Lists.Employees;
import homeTask12Streams.Lists.People;
import homeTask12Streams.Lists.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task9 {


    public static void main(String[] args) {
        lastNamesList(People.getPeopleList(),
                Students.getStudentsList(),
                Employees.getEmployeeList());
        System.out.println(PersonList.showList(listLastNames));
    }

    private static List<String> listLastNames = new LinkedList<>();

    public static void lastNamesList(List<Person> personList,
                                    List<Student> studentList,
                                    List<Employee> employeeList) {
        parsingLastNamesForPeople(personList);
        parsingLastNamesForStudents(studentList);
        parsingLastNamesForEmployees(employeeList);
    }

    public static void parsingLastNamesForPeople(List<Person> localList) {
        for (Person tmp : localList) {
            writeInList(tmp.getLastName());
        }
    }

    public static void parsingLastNamesForStudents(List<Student> localList) {
        for (Student tmp : localList) {
            writeInList(tmp.getLastName());
        }
    }

    public static void parsingLastNamesForEmployees(List<Employee> localList) {
        for (Person tmp : localList) {
            writeInList(tmp.getLastName());
        }
    }

    public static void writeInList(String... s) {
        listLastNames.addAll(Arrays.asList(s));
    }
}
