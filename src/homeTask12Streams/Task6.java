package homeTask12Streams;

import java.util.List;

public class Task6 {


    public static void main(String[] args) {
        int salaryJons = salaryJohns(PersonList.getList());
        System.out.println(salaryJons);
    }

    public static int salaryJohns(List<Person> localList) {
        List<Employee> employeeList = Task2.task2(localList);
        int salaryJohns = 0;
        for (Employee tmp : employeeList) {
            if (tmp.getFirstName().equals("John")) {
                salaryJohns += tmp.getSalary().intValue();
            }
        }
        return salaryJohns;
    }

}
