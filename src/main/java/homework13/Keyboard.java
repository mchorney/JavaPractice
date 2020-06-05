package homework13;

public class Keyboard {
    private String type;
    private String brand;
    private String color;

    public Keyboard(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void printInfo() {
        System.out.println("Keyboard: type = " + type + ", brand = " + brand + ", color =" + color);
    }
}
