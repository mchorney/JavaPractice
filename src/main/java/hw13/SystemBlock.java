package hw13;

public class SystemBlock {
    private Brand brand;
    private Processor processor;
    private Motherboard motherboard;

    public SystemBlock(Brand brand, Processor processor, Motherboard motherboard) {
        this.brand = brand;
        this.processor = processor;
        this.motherboard = motherboard;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
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

    public void printInfo(){
        System.out.println("PC Brand = " + getBrand() + "\n" +
                "Processor brand: " + processor.getBrand() + ", clock frequency: " + processor.getClockFrequency() + ", core count: " +
                processor.getCoreCount() + ", year model: " + processor.getYearModel() + "\n" +
                "Motherboard brand: " + motherboard.getBrand() + ", amount of Ports " + motherboard.getPortsAmount() + ", year of model: " + motherboard.getYearModel() + ", isCompatible: " + motherboard.isCompatible());
    }
    public String toPrintSystemBlock() {
        return " Brand = " + getBrand() + "\n" +
                "Processor brand: " + processor.getBrand() + ", clock frequency: " + processor.getClockFrequency() + ", core count: " +
                processor.getCoreCount() + ", year model: " + processor.getYearModel() + "\n" +
                "Motherboard brand: " + motherboard.getBrand() + ", amount of Ports " + motherboard.getPortsAmount() + ", year of model: " + motherboard.getYearModel() + ", isCompatible: " + motherboard.isCompatible();
    }
}
