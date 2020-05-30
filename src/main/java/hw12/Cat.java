package hw12;

public class Cat {
    private Colors paint;
    private String type;
    private String name;

    public Cat() {

    }

    public Colors getPaint() {
        return paint;
    }

    public void setPaint(Colors paint) {
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

    public Cat(Colors paint, String type, String name) {
        this.paint = paint;
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "paint=" + paint +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
