package hw14;

public class Animal {
    protected String name;
    protected String color;
    protected boolean vegetarian;

    public Animal(String name, String color, boolean vegetarian) {
        this.name = name;
        this.color = color;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }


    public void printAnimal() {
        System.out.println("Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", vegetarian=" + vegetarian +
                '}');
    }
}
