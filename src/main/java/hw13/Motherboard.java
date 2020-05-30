package hw13;

public class Motherboard {
    private Brand brand;
    private Price price;
    private MotherboardType type;

    public Motherboard(Brand brand, Price price, MotherboardType type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public Price getPrice() {
        return price;
    }
    public void setPrice(Price price) {
        this.price = price;
    }
    public MotherboardType getType() {
        return type;
    }
    public void setType(MotherboardType type) {
        this.type = type;
    }

    public String printInfo(){
        return " :(Brand = " + brand+ ",Price = "+ price+ ",Type = "+ type;
    }
}
