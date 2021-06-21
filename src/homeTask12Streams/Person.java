package homeTask12Streams;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private LocalDate birthday;
    private String firstName;
    private String lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(birthday, person.birthday) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public String toString() {
        return "birthday=" + birthday +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + "\', ";
    }

    @Override
    public int
    hashCode() {
        return Objects.hash(birthday, firstName, lastName);
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person() {
    }

    public Person(LocalDate birthday, String firstName, String lastName) {
        this.birthday = birthday;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
