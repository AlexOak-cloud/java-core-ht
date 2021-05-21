package homeTask12Streams;

import java.time.LocalDate;
import java.util.Objects;

public class Student extends Person {

    private String group;
    private int course;

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "group='" + group + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), group, course);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(LocalDate birthday, String firstName, String lastName, String group, int course) {
        super(birthday, firstName, lastName);
        this.group = group;
        this.course = course;
    }

}
