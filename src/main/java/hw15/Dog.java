package hw15;

public class Dog implements Pet{
    private String name;
    private int year;

    public Dog(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String hi() {
        return "Gavvvvv!";
    }

    @Override
    public void sleep() {
        System.out.println(name + " went sleep!");
    }

    @Override
    public void wakeUp() {
        System.out.println(name + " woke up!");
    }
}
