package hw11;

import java.util.Arrays;

public class Horse {
    private String name;
    private int age;
    private String[] colors;

    public Horse() {
    }

    public Horse(String name, int age, String[] colors) {
        this.name = name;
        this.age = age;
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getColors() {
        return colors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public void printClass() {
        System.out.println("Name of the horse: " + name + "\n" +
                "Age of the horse: " + age + "\n" +
                "Color of the horse: " + Arrays.toString(colors));
    }
}