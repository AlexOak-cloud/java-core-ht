package homeTask12Streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {

    private BigDecimal salary;
    private String position;


    @Override
    public String toString() {
        return "Employee{"+super.toString() +
                "salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(salary, employee.salary) &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, position);
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }


    public Employee(LocalDate birthday, String firstName, String lastName, BigDecimal salary, String position) {
        super(birthday, firstName, lastName);
        this.salary = salary;
        this.position = position;
    }
}
