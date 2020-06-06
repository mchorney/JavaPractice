package hw13;

public class Motherboard {
    private MotherboardBrand  brand;
    private String  model;

    public Motherboard(MotherboardBrand brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public MotherboardBrand getBrand() {
        return brand;
    }

    public void setBrand(MotherboardBrand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String printOut() {
        return ("Motherboard " +brand+ " model " +model+" ");
    }
}




