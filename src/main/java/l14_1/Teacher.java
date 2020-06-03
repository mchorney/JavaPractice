package l14_1;

import java.util.Arrays;

public class Teacher {
    private String name;
    private String lastName;
    private int year;
    private Universaty[] universaties;
    private Subject subject;

    public Teacher(String name, String lastName, int year, Universaty[] universaties, Subject subject) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.universaties = universaties;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Universaty[] getUniversaties() {
        return universaties;
    }

    public void setUniversaties(Universaty[] universaties) {
        this.universaties = universaties;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", universaties=" + Arrays.toString(universaties) +
                ", subject=" + subject +
                '}';
    }
}
