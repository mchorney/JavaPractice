package hw1213;

public class Motherboard {
    private MotherboardBrand brand;
    private String model;
    private String ram;

    public Motherboard(MotherboardBrand brand, String model, String ram) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    public void Motherboard(){
        System.out.println();
    }
}
