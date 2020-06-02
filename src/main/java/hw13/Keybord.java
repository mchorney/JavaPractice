package hw13;

public class Keybord {
    private String brand;
    private String model;
    private KeyboardType keyboardType;


    public Keybord(String brand, String model, KeyboardType keyboardType) {
        this.brand = brand;
        this.model = model;
        this.keyboardType = keyboardType;
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

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
    }
    public void printInfo(){
        System.out.println("Keyboard Brand ="+brand +"Keyboard Model = "+model +"Keyboard Type =" +keyboardType);
    }
}
