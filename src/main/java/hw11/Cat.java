package hw11;

import java.util.Arrays;

public class Cat {
    private String name;
    private int age;
    private String color;
    private String[] toys;

    public Cat() {
    }

    public Cat(String name, int age, String color, String[] toys) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.toys = toys;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String[] getToys() {
        return toys;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setToys(String[] toys) {
        this.toys = toys;
    }

    public void printClass() {
        System.out.println("Name of the cat: " + name + "\n" +
                "Age of the cat: " + age + "\n" +
                "Color of the cat: " + color + "\n" +
                "Favorite toys: " + Arrays.toString(toys));
    }
}
