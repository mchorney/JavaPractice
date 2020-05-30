package hw11;

import java.util.Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private String[] hobbies;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, int height, String[] hobbies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.hobbies = hobbies;
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

    public String[] getHobbies() {
        return hobbies;
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

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printClass() {
        System.out.println("First name of the person: " + firstName + "\n" +
                "Last name of the person: " + lastName + "\n" +
                "Age of the person: " + age + "\n" +
                "Height of the person: " + height + "\n" +
                "Hobbies of the person: " + Arrays.toString(hobbies));
    }
}
