package hw12;

import java.util.Arrays;

public class Dog {
    private Colors[] paint;
    private String type;
    private String name;

    public Dog(Colors[] paint, String type, String name) {
        this.paint = paint;
        this.type = type;
        this.name = name;
    }

    public Colors[] getPaint() {
        return paint;
    }

    public void setPaint(Colors[] paint) {
        this.paint = paint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "paint=" + Arrays.toString(paint) +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
