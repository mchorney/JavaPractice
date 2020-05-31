package hw13;

public class SystemBlock {
    private String brand;
    private Processor processor;
    private Motherboard motherboard;
    private int price;

    public SystemBlock(String brand, Processor processor, Motherboard motherboard, int price) {
        this.brand = brand;
        this.processor = processor;
        this.motherboard = motherboard;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("System Block: brand is " + brand + ", price is " + price);
        processor.printInfo();
        motherboard.printInfo();
    }
}
