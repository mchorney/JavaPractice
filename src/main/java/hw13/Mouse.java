package hw13;

public class Mouse {
    private String brand;
    private String model;
    private MouseType mousetype;

    public Mouse(String brand, String model, MouseType mousetype) {
        this.brand = brand;
        this.model = model;
        this.mousetype = mousetype;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MouseType getMousetype() {
        return mousetype;
    }

    public void setMousetype(MouseType mousetype) {
        this.mousetype = mousetype;
    }
    public void printInfo() {
        System.out.println("Brand = " + brand + "\nModel = " + model + "\nType = " +mousetype);
    }
}
