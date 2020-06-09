package hwLesson17;

public class Person {
    private String name;
    private String lastName;
    private double idNumber;

    public Person(String name, String lastName, double idNumber) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getIdNumber() {
        return idNumber;
    }

    public void printOut() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                '}');
    }
}
