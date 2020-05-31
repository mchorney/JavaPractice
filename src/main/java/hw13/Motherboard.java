package hw13;

public class Motherboard {
    private String name;
    private Brand brand;

    public Motherboard(String name, Brand brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public String printInfo() {
        return "Motherboard {Brand = "+ brand + ";" + " Name = " + name + '}';
    }
}
