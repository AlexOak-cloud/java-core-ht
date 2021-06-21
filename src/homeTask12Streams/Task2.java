package homeTask12Streams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<Employee> listEmployee = task2(PersonList.getList());
        System.out.println(PersonList.showList(listEmployee));
    }

    public static List<Employee> task2(List<Person> localList) {
        List<Employee> returningList = new ArrayList<>();
        for (Person tmp : localList) {
            if (tmp.getClass() == Employee.class) {
                returningList.add((Employee) tmp);
            }
        }
        return returningList;
    }
}
