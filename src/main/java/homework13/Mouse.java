package homework13;

public class Mouse {
    private String type;
    private String model;
    private String color;

    public Mouse(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void printInfo() {
        System.out.println("Mouse: type = " + type + ", model = " + model + ", color =" + color);
}}
