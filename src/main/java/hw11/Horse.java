package hw11;

public class Horse {
    private String name;
    private int age;
    private String color;

    public Horse() {
    }

    public Horse(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printClass() {
        System.out.println("Name of the horse: " + name + "\n" +
                "Age of the horse: " + age + "\n" +
                "Color of the horse: " + color);
    }
}