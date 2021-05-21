package homeTask12Streams;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<Student> studentList = task3(PersonList.getList());

        System.out.println(PersonList.showList(studentList));
    }

    public static List<Student> task3(List<Person> localList) {
        List<Student> studentList = Task1.task1(localList);
        List<Student> returningList = new ArrayList<>();
        for (Student tmp : studentList) {
            if (tmp.getCourse() >= 3) {
                int age = LocalDateTime.now().getYear() - tmp.getBirthday().getYear();
                if(age >= 22){
                    returningList.add(tmp);
                }
            }
        }
        return returningList;
    }
}

