package homeTask12Streams;


import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 implements Positions{

    public static void main(String[] args) {
        List<Employee> employeeList = searchMinSalary(PersonList.getList());
        System.out.println(PersonList.showList(employeeList));
    }


    public static List<Employee> searchMinSalary(List<Person> localList){
        List<Employee> employeeList = Task2.task2(localList);
        return employeeList.stream()
                .filter(x -> x.getSalary().intValue() >= 1000 &&
                        x.getSalary().intValue() <= 1500)
                .filter(x -> x.getPosition().equals(Positions.enginer) ||
                        x.getPosition().equals(Positions.laborant))
                .filter(x -> x.getBirthday().getMonth() == Month.JANUARY)
                .collect(Collectors.toList());
    }
}
