package hw13;

public class Keyboard {
    private int keysAmount;
    private String model;
    private Brand brand;

    public Keyboard(Brand brand, String model, int keysAmount) {
        this.brand = brand;
        this.model = model;
        this.keysAmount = keysAmount;
    }

    public int getKeysAmount() {
        return keysAmount;
    }

    public void setKeysAmount(int keysAmount) {
        this.keysAmount = keysAmount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("Brand = " + getBrand() + ", Model = " + getModel() + ", Key amount = " + getKeysAmount());
    }

    public String toPrintKeyboard() {
        return "Brand = " + brand + ", Model = " + model + ", Key amount = " + keysAmount;
    }
}
