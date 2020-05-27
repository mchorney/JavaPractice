package hw10;

public class Teacher {
    public String firstName;
    public String lastName;
    public String topic;

    public void introduction() {
        System.out.println("Hi, my name is " + firstName + " " + lastName + " and today we have interesting topic about " + topic);
    }

    public void doHomework() {
        System.out.println("Please finish today's topic about " + topic + " before next lesson");
    }
}
