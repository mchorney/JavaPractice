package hw13;

public class Motherboard {
    private String  brand;
    private String  model;
    private String  ram;

    public Motherboard(String brand, String model, String ram) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
