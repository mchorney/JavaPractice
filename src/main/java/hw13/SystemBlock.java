package hw13;

import java.util.PrimitiveIterator;

public class SystemBlock {
    private Brand brand;
    private SystemBlockType type;
    private Processor processor;
    private Motherboard motherboard;

    public SystemBlock(Brand brand, SystemBlockType type, Processor processor, Motherboard motherboard) {
        this.brand = brand;
        this.type = type;
        this.processor = processor;
        this.motherboard = motherboard;
    }

    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public SystemBlockType getType() {
        return type;
    }
    public void setType(SystemBlockType type) {
        this.type = type;
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

    public String printInfo(){
        return "Brand = " + brand + ", Type = "+ type+ ", Processor " + processor.printInfo() +", Motherboard " + motherboard.printInfo() + ")";
    }
}
