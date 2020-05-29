package hw11;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int height;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printClass() {
        System.out.println("First name of the person: " + firstName + "\n" +
                "Last name of the person: " + lastName + "\n" +
                "Age of the person: " + age + "\n" +
                "Height of the person: " + height);
    }
}
