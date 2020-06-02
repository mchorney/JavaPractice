package hw13;

public class Motherboard {
    private Brand brand;
    private MotherboardType type;

    public Motherboard(Brand brand, MotherboardType type) {
        this.brand = brand;
        this.type = type;
    }

    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public MotherboardType getType() {
        return type;
    }
    public void setType(MotherboardType type) {
        this.type = type;
    }

    public String printInfo(){
        return ":(Brand = " + brand + ", Type = " + type + ")";
    }
}
