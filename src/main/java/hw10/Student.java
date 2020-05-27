package hw10;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public char sex;

    public void introduction() {
        System.out.println("Hi, my name is " + firstName + " " + lastName + " and I'm " + age + " years old");
    }

    public void doHomework(int minutes) {
        System.out.println("My homework was complete in " + minutes + " minutes");
    }
}
