package hw11;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Dog() {
    }

    public Dog(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void printClass() {
        System.out.println("Name of the dog: " + name + "\n" +
                "Age of the dog: " + age + "\n" +
                "Weight of the dog: " + weight + "\n" +
                "Color of the dog: " + color);
    }
}
