package hw13;

public class SystemBlock {
    private Processor processor;
    private Motherboard motherboard;

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


    public SystemBlock(Processor processor, Motherboard motherboard) {
        this.processor = processor;
        this.motherboard = motherboard;
    }

    public String printInfo() {
        return "System Block {Processor = "+ processor + ";" + " Motherboard = "+ motherboard + '}';
    }
}
