package hw13;

public class Motherboard {
    private MotherboardBrands motherboardBrands;
    private Price price;


    public Motherboard(MotherboardBrands motherboardBrands, Price price) {
        this.motherboardBrands = motherboardBrands;
        this.price = price;
    }

    public MotherboardBrands getMotherboardBrands() {
        return motherboardBrands;
    }

    public void setMotherboardBrands(MotherboardBrands motherboardBrands) {
        this.motherboardBrands = motherboardBrands;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String printInfo(){
        return "Mother Board { Brand = "+ motherboardBrands +", Price ="+ price +'}';
    }
}
