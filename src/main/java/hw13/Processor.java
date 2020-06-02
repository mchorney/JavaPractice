package hw13;

public class Processor {
    private Brand brand;
    private ProcessorType model;

    public Processor(Brand brand, ProcessorType model) {
        this.brand = brand;
        this.model = model;
    }
    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public ProcessorType getModel() {
        return model;
    }
    public void setModel(ProcessorType model) {
        this.model = model;
    }

    public String printInfo(){
        return ":(Brand = " + brand+ ", Model = "+ model + ")";
    }
}
