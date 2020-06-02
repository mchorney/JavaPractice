package hw13;

public class Keyboard {
    private Brand brand;
    private String model;
    private KeyboardType type;

    public Keyboard(Brand brand, String model, KeyboardType type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }
    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public KeyboardType getType() {
        return type;
    }
    public void setType(KeyboardType type) {
        this.type = type;
    }

    public String printInfo(){
        return ":(Brand = " + brand+ ", Model = "+ model+ ", Type = "+ type + ")";
    }
}