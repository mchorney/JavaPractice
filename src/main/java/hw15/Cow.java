package hw15;

public class Cow implements Animal{
    private String name;
    private String color;
    private int age;

    public Cow(String name,String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    @Override
    public void animalSound() {
        System.out.println("Muu-uuu!");
    }
    @Override
    public void eat() {
        System.out.println(name + " is ready to eat");

    }
    @Override
    public void sleep() {
        System.out.println(name + " is ready to sleep.");

    }


}