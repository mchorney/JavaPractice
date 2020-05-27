package hw10;

public class Horse {
    public String familyName;
    public int age;
    public String color;

    public void run() {
        System.out.println("Horse " + familyName + " is ready to run");
    }

    public void sleep() {
        System.out.println("Horse " + familyName + " is ready to sleep");
    }
}