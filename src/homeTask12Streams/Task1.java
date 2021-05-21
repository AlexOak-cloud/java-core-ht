package homeTask12Streams;

import java.util.ArrayList;
import java.util.List;

public class Task1 {


    public static void main(String[] args) {
        List<Student> listStudent = task1(PersonList.getList());
        System.out.println(PersonList.showList(listStudent));
    }

    public static List<Student> task1(List<Person> localList) {
        List<Student> newList = new ArrayList<>();
        for (Person tmp : localList) {
            if (tmp.getClass() == Student.class) {
                newList.add((Student) tmp);
            }
        }
        return newList;
    }
}